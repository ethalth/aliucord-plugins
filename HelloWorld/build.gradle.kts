plugins {
    id("com.android.library")
    kotlin("android")
    id("com.aliucord.gradle-plugin")
}

android {
    compileSdk = 30

    defaultConfig {
        minSdk = 21
        targetSdk = 30
    }

    sourceSets["main"].java.srcDirs("src/main/kotlin")
}

aliucord {
    pluginName.set("HelloWorld")
    description.set("A simple /hello command plugin")
    author.set("ethalth")
}
