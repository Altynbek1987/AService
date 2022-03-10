plugins {
    id("com.android.application")
    id("kotlin-android")
    // Kapt
    id("kotlin-kapt")

    // Navigation Safe Args
    id("androidx.navigation.safeargs.kotlin")

    // Hilt
    id("dagger.hilt.android.plugin")

    // Google Services
    id("com.google.gms.google-services")

}


android {
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = "com.example.aservice"
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = Config.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
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
    implementation(project(":feature-sign"))
    implementation(project(":feature-main"))
    implementation(project(":common"))

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
    implementation("com.google.firebase:firebase-auth-ktx:21.0.1")
    implementation("com.google.firebase:firebase-firestore-ktx:24.0.1")
    implementation("com.google.firebase:firebase-storage-ktx:20.0.0")
    kapt(Dependencies.Android.Hilt.daggerHiltCompiler)

    //Hilt Navigation
    implementation(Dependencies.Android.Hilt.hiltNavigationFragment)

    // ViewBindingPropertyDelegate
    // | kirich1409 | To use only without reflection variants of viewBinding
    implementation(Dependencies.Android.UIComponent.viewBindingPropertyDelegate)

    // Coil
    implementation(Dependencies.Android.UIComponent.coil)

    //FirebaseAuth
    implementation(Dependencies.Android.Firebase.firebaseAuth)
    implementation(Dependencies.Android.Firebase.firebaseAuthKtx)

    //Firestore
    implementation(Dependencies.Android.Firebase.firebaseFirestore)
    //fs-ui
    implementation(Dependencies.Android.Firebase.firebaseUIForCloudFirestore)
    //fs-coroutines
    implementation(Dependencies.Android.Firebase.coroutinesWithFirebase)
    implementation(Dependencies.Android.Firebase.firebaseLifeCycle)
    implementation(Dependencies.Android.Firebase.firebaseLiveData)

    // FirebaseBom
    implementation(Dependencies.Android.Firebase.fireBaseBom)

    // FirebasePlayStore
    implementation(Dependencies.Android.Firebase.fireBasePlayStore)

}
