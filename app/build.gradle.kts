plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = Versions.CompileSdkVersion

    defaultConfig {
        applicationId = "com.fidloo.flux"
        minSdk = Versions.MinSdkVersion
        targetSdk = Versions.TargetSdkVersion
        versionCode = Versions.VersionCode
        versionName = Versions.VersionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    signingConfigs {
        // We use a bundled debug keystore, to allow debug builds from CI to be upgradable
        getByName("debug") {
            storeFile = file("../debug.keystore")
            storePassword = "android"
            keyAlias = "androiddebugkey"
            keyPassword = "android"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildTypes {
        named("debug") {
            signingConfig = signingConfigs.getByName("debug")
        }
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"))
        }
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    packagingOptions {
        // Multiple dependency bring these files in. Exclude them to enable
        // our test APK to build (has no effect on our AARs)
        resources.excludes += "/META-INF/AL2.0"
        resources.excludes += "/META-INF/LGPL2.1"
    }
}

dependencies {
    implementation(project(":presentation"))
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":common"))

    implementation(Libs.Kotlin.stdlib)
    implementation(Libs.Coroutines.android)

    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.AndroidX.navigation)
    implementation(Libs.AndroidX.Activity.activityCompose)
    implementation(Libs.AndroidX.ConstraintLayout.constraintLayoutCompose)

    implementation(Libs.AndroidX.Compose.runtime)
    implementation(Libs.AndroidX.Compose.foundation)
    implementation(Libs.AndroidX.Compose.layout)
    implementation(Libs.AndroidX.Compose.ui)
    implementation(Libs.AndroidX.Compose.uiUtil)
    implementation(Libs.AndroidX.Compose.material)
    implementation(Libs.AndroidX.Compose.animation)
    implementation(Libs.AndroidX.Compose.iconsExtended)
    implementation(Libs.AndroidX.Compose.tooling)
    implementation(Libs.AndroidX.Compose.hilt)
    implementation(Libs.AndroidX.lifecycle)
    implementation(Libs.AndroidX.appcompat)
    implementation(Libs.material)

    implementation(Libs.Accompanist.coil)
    implementation(Libs.Accompanist.insets)

    androidTestImplementation(Libs.AndroidX.Activity.activityCompose)

    implementation(Libs.Hilt.library)
    kapt(Libs.Hilt.androidCompiler)

    androidTestImplementation(Libs.JUnit.junit)
    androidTestImplementation(Libs.AndroidX.Test.core)
    androidTestImplementation(Libs.AndroidX.Test.espressoCore)
    androidTestImplementation(Libs.AndroidX.Test.rules)
    androidTestImplementation(Libs.AndroidX.Test.Ext.junit)
    androidTestImplementation(Libs.AndroidX.Compose.uiTest)
    androidTestImplementation(Libs.AndroidX.Test.runner)
    androidTestImplementation(Libs.Coroutines.test)
    androidTestImplementation(Libs.Hilt.library)
    androidTestImplementation(Libs.Hilt.testing)
}

kapt {
    correctErrorTypes = true
}