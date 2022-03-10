object Dependencies {

    object Plugins {
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10"
        const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.2"
        const val navigationSafeArgsPlugin =
            "androidx.navigation:navigation-safe-args-gradle-plugin:2.4.1"
        const val hiltAndroidGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:2.40.5"
        const val googleService = "com.google.gms:google-services:4.3.10"
    }

    object Android {
        object Kotlin {
            const val kotlinCoroutinesAndroid =
                "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0"
        }

        object UIComponent {
            const val materialIO = "com.google.android.material:material:1.5.0"
            const val constraint = "androidx.constraintlayout:constraintlayout:2.1.3"
            const val viewBindingPropertyDelegate =
                "com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.3"
            const val coil = "io.coil-kt:coil:1.4.0"
        }

        object Firebase {
            const val firebaseAuth = "com.google.firebase:firebase-auth:21.0.1"
            const val firebaseAuthKtx = "com.google.firebase:firebase-auth-ktx"

            // FireStore
            const val firebaseFirestore = "com.google.firebase:firebase-firestore-ktx:23.0.3"

            // FireStoreUI
            const val firebaseUIForCloudFirestore = "com.firebaseui:firebase-ui-firestore:8.0.0"

            // Coroutines with fireStore
            const val coroutinesWithFirebase =
                "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.3.9"
            const val firebaseLifeCycle = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
            const val firebaseLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.1"

            // FirebaseBom
            const val fireBaseBom = "com.google.firebase:firebase-bom:28.4.0"

            // FirebasePlayStoreService
            const val fireBasePlayStore = "com.google.android.gms:play-services-auth:19.2.0"
        }

        object Hilt {
            const val daggerHiltAndroid = "com.google.dagger:hilt-android:2.40.5"
            const val daggerHiltCompiler = "com.google.dagger:hilt-compiler:2.40.5"
            const val hiltNavigationFragment = "androidx.hilt:hilt-navigation-fragment:1.0.0"

        }

        object LifeCycle {
            const val lifeCycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1"
            const val lifeCycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:2.4.1"
            const val lifeCycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.1"
        }

        const val coreKtx = "androidx.core:core-ktx:1.7.0"
        const val appCompat = "androidx.appcompat:appcompat:1.4.1"
        const val activityAndroid = "androidx.activity:activity-ktx:1.4.0"
        const val fragmentAndroid = "androidx.fragment:fragment-ktx:1.4.1"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:2.4.1"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:2.4.1"

    }
}