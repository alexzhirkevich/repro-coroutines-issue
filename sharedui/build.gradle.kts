@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
    kotlin("native.cocoapods")
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
    alias(libs.plugins.serialization)
}


kotlin {

    jvm("desktop") {}

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("dev.gitlive:firebase-firestore:1.10.0")
//                implementation("dev.gitlive:firebase-auth:1.10.0")
                implementation(compose.material3)
                implementation(compose.foundation)
            }
        }
        val desktopMain by getting{
            dependencies {
                implementation(libs.coroutines.swing)
            }
        }
    }
}
