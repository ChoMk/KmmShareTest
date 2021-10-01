plugins {
    id("com.android.application")
    id("kotlin-kapt")
    kotlin("android")
    kotlin("android.extensions")
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("dev.icerock.moko:mvvm:0.11.0")
    implementation ("org.reduxkotlin:redux-kotlin-threadsafe:0.5.5")

}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.example.kmmsharetest.android"
        minSdkVersion(23)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        dataBinding = true
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}