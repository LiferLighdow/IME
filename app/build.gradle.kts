plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.liferlighdow.ime"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.liferlighdow.ime"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
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
}

dependencies {
    // No external dependencies for ultra-lightweight
}
