import com.strumenta.antlrkotlin.gradle.AntlrKotlinTask
import com.vanniktech.maven.publish.SonatypeHost
import de.aaschmid.gradle.plugins.cpd.Cpd
import io.gitlab.arturbosch.detekt.Detekt
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    alias(libs.plugins.antlr.kotlin)
    alias(libs.plugins.dokka)
    alias(libs.plugins.gitSemVer)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotest.multiplatform)
    alias(libs.plugins.kotlin.qa)
    alias(libs.plugins.npm.publish)
    alias(libs.plugins.multiJvmTesting)
    alias(libs.plugins.taskTree)
    alias(libs.plugins.mavenPublish)
    alias(libs.plugins.serialization)
}

group = "io.github.freshmag"

repositories {
    google()
    mavenCentral()
}

multiJvm {
    jvmVersionForCompilation.set(21)
}

kotlin {
    jvmToolchain(21)

    jvm {
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions {
                    jvmTarget = JvmTarget.JVM_1_8
                }
            }
        }
    }

    sourceSets {
        commonMain {
            kotlin {
                srcDir(layout.buildDirectory.dir("generatedAntlr"))
            }

            dependencies {
                implementation(libs.antlr.runtime)
                implementation(libs.yamlkt)
            }
        }

        commonTest.dependencies {
            implementation(libs.bundles.kotlin.testing.common)
            implementation(libs.bundles.kotest.common)
        }

        jvmTest.dependencies {
            implementation(libs.kotest.runner.junit5)
        }
    }

    js(IR) {
        // avoid already taken "testo" package name on NPM
        moduleName = "testo-example"
        browser()
        nodejs()
        binaries.library()
    }

    applyDefaultHierarchyTemplate()

    targets.all {
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions {
                    allWarningsAsErrors = true
                    freeCompilerArgs.add("-Xexpect-actual-classes")
                }
            }
        }
    }
}

// Package set for generated ANTLR files
val generatedFilesPackage = "io.github.testo.parsers.generated"

// Output dir where ANTLR outputs are generated
val generatedFilesOutputDir = "generatedAntlr/${generatedFilesPackage.replace(".", "/")}"

val generateKotlinGrammarSource =
    tasks.register<AntlrKotlinTask>("generateKotlinGrammarSource") {
        dependsOn("cleanGenerateKotlinGrammarSource")

        source =
            fileTree(layout.projectDirectory.dir("antlr")) {
                include("**/*.g4")
            }
        packageName = generatedFilesPackage
        arguments = listOf("-visitor")

        outputDirectory =
            layout.buildDirectory
                .dir(generatedFilesOutputDir)
                .get()
                .asFile
    }

/**
 * Unfortunately, the generated code contains some unsafe calls suppression annotations that are not needed.
 * At the time of writing, there is an open issue of the antlr-kotlin plugin that will address this
 * (https://github.com/Strumenta/antlr-kotlin/issues/200).
 *
 * For the time being, this ugly workaround will remove the annotations from the generated code.
 */
generateKotlinGrammarSource.configure {
    doLast {
        val outputDirectory =
            layout.buildDirectory
                .dir(generatedFilesOutputDir)
                .get()
                .asFile

        outputDirectory
            .walkTopDown()
            .filter { it.isFile && it.extension == "kt" }
            .forEach { file ->
                val updatedLines =
                    file
                        .readLines()
                        .filterNot { it.contains("@Suppress(\"UNSAFE_CALL\")") }

                file.writeText(updatedLines.joinToString("\n"))
            }
    }
}

tasks.withType<KotlinCompilationTask<*>> {
    dependsOn(generateKotlinGrammarSource)
}

tasks.withType<Detekt>().configureEach {
    dependsOn(generateKotlinGrammarSource)
    exclude("**/generated/**")
}

tasks.withType<Cpd>().configureEach {
    dependsOn(generateKotlinGrammarSource)
    source = files("src/").asFileTree // excluding generated files
}

tasks.withType<Jar>().configureEach {
    dependsOn(generateKotlinGrammarSource)
}

tasks.named("jsSourcesJar") {
    dependsOn(generateKotlinGrammarSource)
}

tasks.named("jvmSourcesJar") {
    dependsOn(generateKotlinGrammarSource)
}

tasks.named("dokkaHtml") {
    dependsOn(generateKotlinGrammarSource)
}

tasks.named("sourcesJar") {
    dependsOn(generateKotlinGrammarSource)
}

ktlint {
    filter {
        exclude("**/generated/**")
    }
}

publishing {
    repositories {
        maven {
            name = "githubPackages"
            url = uri("https://maven.pkg.github.com/FreshMag/testo")
            credentials(PasswordCredentials::class)
        }
    }
}

mavenPublishing {

    // Configure POM metadata for the published artifact
    pom {
        name.set("KMP Test project")
        description.set("Example project for KMP")
        inceptionYear.set("2024")
        url.set("https://github.com/FreshMag/testo")

        licenses {
            license {
                name.set("Apache License 2.0")
                url.set("https://opensource.org/license/Apache-2.0/")
            }
        }

        // Specify developer information
        developers {
            developer {
                id.set("FreshMag")
                name.set("Francesco Magnani")
                email.set("magnani.franci2000@gmail.com")
            }
        }

        // Specify SCM information
        scm {
            url.set("https://github.com/FreshMag/testo")
        }
    }
    // Enable GPG signing for all publications
    signAllPublications()

    if (System.getenv("CI") == "true") {
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL, automaticRelease = false)
    }
}

npmPublish {
    packages {
        named("js") {
            packageName = "testo-example"
        }
    }

    registries {
        register("npmjs") {
            uri.set("https://registry.npmjs.org")
            if (System.getenv("CI") == "true") {
                authToken.set(System.getenv("NPM_TOKEN"))
            } else {
                val npmToken: String? by project
                authToken.set(npmToken)
                dry.set(npmToken.isNullOrBlank())
            }
        }
    }
}
