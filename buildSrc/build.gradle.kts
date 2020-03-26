plugins {
    `kotlin-dsl`
}

repositories {
<<<<<<< HEAD
    google()
    jcenter()
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
}

object versions {
    val kotlin = "1.4-M1"

    object android {
        const val build_tools = "3.6.0"
    }
}

dependencies {
    api("com.android.tools.build:gradle:${versions.android.build_tools}")
=======
    jcenter()
}

dependencies {

>>>>>>> 598234fa219530a25acc3e9a0c85d5793697739b
}