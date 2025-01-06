import org.danilopianini.gradle.mavencentral.JavadocJar
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.dokka)
    alias(libs.plugins.gitSemVer)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotest.multiplatform)
    alias(libs.plugins.kotlin.qa)
    alias(libs.plugins.npm.publish)
    alias(libs.plugins.multiJvmTesting)
    alias(libs.plugins.taskTree)
    alias(libs.plugins.publishOnCentral)
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
        val commonMain by getting { }
        val commonTest by getting {
            dependencies {
                implementation(libs.bundles.kotlin.testing.common)
                implementation(libs.bundles.kotest.common)
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(libs.kotest.runner.junit5)
            }
        }
    }

    js(IR) {
        browser()
        nodejs()
        binaries.library()
    }

    // Temporarily disabled due to https://youtrack.jetbrains.com/issue/KT-72858
//    wasmWasi {
//        nodejs()
//        binaries.library()
//    }

    applyDefaultHierarchyTemplate()
//    /*
//     * Linux 64
//     */
//    linuxX64(nativeSetup)
//    linuxArm64(nativeSetup)
//    /*
//     * Win 64
//     */
//    mingwX64(nativeSetup)
//    /*
//     * Apple OSs
//     */
//    macosX64(nativeSetup)
//    macosArm64(nativeSetup)
//    iosArm64(nativeSetup)
//    iosSimulatorArm64(nativeSetup)
//    watchosArm32(nativeSetup)
//    watchosArm64(nativeSetup)
//    watchosSimulatorArm64(nativeSetup)
//    tvosArm64(nativeSetup)
//    tvosSimulatorArm64(nativeSetup)

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

tasks.dokkaJavadoc {
    enabled = false
}

tasks.withType<JavadocJar>().configureEach {
    val dokka = tasks.dokkaHtml.get()
    dependsOn(dokka)
    from(dokka.outputDirectory)
}

publishOnCentral {
    projectLongName.set("KMP Test project")
    projectDescription.set("Example project for KMP")
    publishing {
        publications {
            withType<MavenPublication> {
                pom {
                    developers {
                        developer {
                            name.set("Francesco Magnani")
                            email.set("magnani.franci2000@gmail.com")
                        }
                    }
                }
            }
        }
    }
}

npmPublish {
    registries {
        register("npmjs") {
            uri.set("https://registry.npmjs.org")
            val npmToken: String? by project
            authToken.set(npmToken)
            dry.set(npmToken.isNullOrBlank())
        }
    }
}

publishing {
    publications {
        publications.withType<MavenPublication>().configureEach {
            if ("OSSRH" !in name) {
                artifact(tasks.javadocJar)
            }
        }
    }
}
