dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
    }
}
rootProject.name = "A Service"
include(":app")
include(":feature-main")
include(":feature-sign")
include(":feature-admin")
include(":feature-owner")
include(":common")
