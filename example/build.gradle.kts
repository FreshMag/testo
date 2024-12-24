import org.danilopianini.gradle.mavencentral.DocStyle

plugins {
    alias(libs.plugins.ktMpp.mavenPublish)
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                // put your common main dependencies here
            }
        }
        commonTest {
            dependencies {
                // put your common test dependencies here
            }
        }

        getByName("jvmMain") {
            dependencies {
                // put your JVM main dependencies here
            }
        }

        getByName("jsMain") {
            dependencies {
                // put your JVM test dependencies here
            }
        }
    }
}

publishOnCentral {
    val githubSlug = "FreshMag/testo"
    projectUrl = "https://github.com/$githubSlug"
    projectDescription = "Simple Kotlin Multiplatform test project"
    licenseName = "Apache License 2.0"
    projectLongName = "Testo Kotlin Multiplatform test project"
    licenseUrl = "https://opensource.org/license/Apache-2.0/"
    docStyle = DocStyle.HTML
    publishing {
        publications {
            withType<MavenPublication>().configureEach {
                if ("OSSRH" !in name) {
                    artifact(tasks.javadocJar)
                }
                scmConnection = "git:git@github.com:$githubSlug"
                projectUrl = "https://github.com/$githubSlug"
                pom {
                    developers {
                        developer {
                            name = "Francesco Magnani"
                            email = "magnani.franci2000@gmail.com"
                            url = "https://github.com/FreshMag"
                        }
                    }
                }
            }
        }
    }
}
