pluginManagement {
    repositories {
        google()
        jcenter()
        maven(url = "https://jitpack.io")
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }

    val versions = object {
        val kotlin = "1.3.72"
        val android_tools = "3.6.0"
        val jfrog = "1.8.5"
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.contains("kotlin.multiplatform")) {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${versions.kotlin}")
            }
            if (requested.id.id.contains("serialization")) {
                useModule("org.jetbrains.kotlin:kotlin-serialization:${versions.kotlin}")
            }
            if (requested.id.id.contains("android")) {
                useModule("com.android.tools.build:gradle:${versions.android_tools}")
            }
            if (requested.id.id.contains("jfrog")) {
                useModule("com.jfrog.bintray.gradle:gradle-bintray-plugin:${versions.jfrog}")
            }
        }
    }
}

rootProject.name = "asoft-core"

include("asoft-test")
include("asoft-platform")
include("asoft-rx")
include(":asoft-io")
include(":asoft-email")
include(":asoft-phone")
include(":asoft-klock")
include(":asoft-krypto")
include(":asoft-persist")
include(":asoft-money")