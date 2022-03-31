/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
object Versions {
    const val CompileSdkVersion = 31
    const val MinSdkVersion = 23
    const val TargetSdkVersion = 31

    const val VersionCode = 1
    const val VersionName = "1.0"

    const val ktlint = "0.40.0"
}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.1.2"

    object Accompanist {
        private const val version = "0.10.0"
        const val coil = "com.google.accompanist:accompanist-coil:$version"
        const val insets = "com.google.accompanist:accompanist-insets:$version"
    }

    object Kotlin {
        private const val version = "1.6.10"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object Coroutines {
        private const val version = "1.4.2"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object JUnit {
        private const val version = "4.13.2"
        const val junit = "junit:junit:$version"
    }

    const val material = "com.google.android.material:material:1.3.0"

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.5.0-beta01"
        const val navigation = "androidx.navigation:navigation-compose:2.4.1"

        object Compose {
            const val snapshot = ""
            const val version = "1.1.1"

            const val animation = "androidx.compose.animation:animation:$version"
            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val iconsExtended = "androidx.compose.material:material-icons-extended:$version"
            const val material = "androidx.compose.material:material:$version"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val ui = "androidx.compose.ui:ui:$version"
            const val uiUtil = "androidx.compose.ui:ui-util:$version"
            const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
            const val hilt = "androidx.hilt:hilt-navigation-compose:1.0.0"
        }

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.4.0"
        }

        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.0"
        const val appcompat = "androidx.appcompat:appcompat:1.3.0-beta01"

        object ConstraintLayout {
            const val constraintLayoutCompose =
                "androidx.constraintlayout:constraintlayout-compose:1.0.0"
        }

        object Test {
            private const val version = "1.3.0"
            const val runner = "androidx.test:runner:$version"
            const val core = "androidx.test:core:$version"
            const val rules = "androidx.test:rules:$version"

            object Ext {
                private const val version = "1.1.2"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }

            const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
        }
    }

    object Hilt {
        private const val version = "2.41"
        const val library = "com.google.dagger:hilt-android:$version"
        const val androidCompiler = "com.google.dagger:hilt-android-compiler:$version"
        const val testing = "com.google.dagger:hilt-android-testing:$version"
        const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
        const val common = "androidx.hilt:hilt-common:1.0.0"
        const val compiler = "androidx.hilt:hilt-compiler:1.0.0"
        const val navigationFragment = "androidx.hilt:hilt-navigation-fragment:1.0.0"
        const val work = "androidx.hilt:hilt-work:1.0.0"
    }
}
