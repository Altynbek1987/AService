// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.Plugins.androidGradlePlugin)
        classpath(Dependencies.Plugins.kotlinGradlePlugin)

        // Navigation Safe Args
        classpath(Dependencies.Plugins.navigationSafeArgsPlugin)

        // Hilt
        classpath(Dependencies.Plugins.hiltAndroidGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")

        //firebase
        classpath(Dependencies.Plugins.googleService)
        classpath("com.google.gms:google-services:4.3.10")
    }

}

//task clean(type: Delete) {
//    delete rootProject.buildDir
//}