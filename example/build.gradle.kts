import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.mavenPublish)
    alias(libs.plugins.ktMpp.npmPublish)
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

mavenPublishing {
    // Define coordinates for the published artifact
    coordinates(
        "io.github.freshmag",
        "testo-example",
        version.toString()
    )

    // Configure POM metadata for the published artifact
    pom {
        name.set("KMP Library for saving data to the clipboard")
        description.set("This library can be used by Android and iOS targets for the shared functionality of saving data to the clipboard")
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
                email.set("pescomagnani@gmail.com")
            }
        }

        // Specify SCM information
        scm {
            url.set("https://github.com/FreshMag/testo")
        }
    }

    // Configure publishing to Maven Central
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    // Enable GPG signing for all publications
    signAllPublications()
}