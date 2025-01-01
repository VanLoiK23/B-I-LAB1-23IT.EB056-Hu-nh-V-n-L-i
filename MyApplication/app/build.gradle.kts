plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)  // Specify Kotlin version here
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    viewBinding {
        enable = true
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.2"
    }
}

dependencies {
    // Basic libraries
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    // Compose libraries
    implementation("androidx.compose.ui:ui:1.5.2")
    implementation("androidx.compose.material:material:1.5.2")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.2")
    implementation("androidx.compose.runtime:runtime:1.5.2")
    implementation("androidx.activity:activity-compose:1.9.3")
    implementation(libs.androidx.material3.android)

    // Compose tooling
    debugImplementation("androidx.compose.ui:ui-tooling:1.5.2")

    // LiveData support for Compose
    implementation("androidx.compose.runtime:runtime-livedata:1.5.2")

    // ViewModel support for Compose
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")

    // Navigation for Compose
    implementation("androidx.navigation:navigation-compose:2.7.4")

    // Animation support
    implementation("androidx.compose.animation:animation:1.5.2")

    // Testing libraries
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
