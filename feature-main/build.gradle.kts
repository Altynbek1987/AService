plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    // Kapt
    id("kotlin-kapt")

    // Navigation Safe Args
    id("androidx.navigation.safeargs.kotlin")

    // Hilt
    id("dagger.hilt.android.plugin")

}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    api(project(":common"))
    // Kotlin
    // | Coroutines
    implementation(Dependencies.Android.Kotlin.kotlinCoroutinesAndroid)
    //Core
    implementation(Dependencies.Android.coreKtx)
    //AppCompat
    implementation(Dependencies.Android.appCompat)
    //Material Design
    implementation(Dependencies.Android.UIComponent.materialIO)
    //UI Component
    implementation(Dependencies.Android.UIComponent.constraint)
    // Activity
    implementation(Dependencies.Android.activityAndroid)
    // Fragment
    implementation(Dependencies.Android.fragmentAndroid)
    // Navigation
    implementation(Dependencies.Android.navigationFragment)
    implementation(Dependencies.Android.navigationUI)
    // | for ViewModel
    implementation(Dependencies.Android.LifeCycle.lifeCycleViewModelKtx)
    // | for LiveData
    implementation(Dependencies.Android.LifeCycle.lifeCycleLiveData)
    // Lifecycles only (without ViewModel or LiveData)
    implementation(Dependencies.Android.LifeCycle.lifeCycleRuntime)
    // Hilt
    implementation(Dependencies.Android.Hilt.daggerHiltAndroid)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    kapt(Dependencies.Android.Hilt.daggerHiltCompiler)
    //Hilt Navigation
    implementation(Dependencies.Android.Hilt.hiltNavigationFragment)
    // ViewBindingPropertyDelegate
    // | kirich1409 | To use only without reflection variants of viewBinding
    implementation(Dependencies.Android.UIComponent.viewBindingPropertyDelegate)
    // Coil
    implementation(Dependencies.Android.UIComponent.coil)

    // Coroutines with fireStore
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.6.0")

    implementation("com.google.firebase:firebase-firestore-ktx:24.0.1")
    implementation("androidx.core:core-ktx:1.7.0")

}