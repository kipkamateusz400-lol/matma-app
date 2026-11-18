plugins { id("com.android.application") }
android {
    namespace = "pl.mateusz.matma"
    compileSdk = 34
    defaultConfig {
        applicationId = "pl.mateusz.matma"
        minSdk = 24
        targetSdk = 34
        versionCode = (System.getenv("GITHUB_RUN_NUMBER") ?: "1").toInt()
        versionName = "1." + (System.getenv("GITHUB_RUN_NUMBER") ?: "0")
    }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
}
