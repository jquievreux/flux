/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

buildscript {
    extra["kotlin_version"] = "1.6.10"
    extra["coroutines_version"] = "1.4.2"

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(Libs.androidGradlePlugin)
        classpath(Libs.Kotlin.gradlePlugin)
        classpath(Libs.Hilt.gradlePlugin)
    }
}

plugins {
    id("com.diffplug.spotless") version "5.7.0"
    id("com.github.ben-manes.versions") version "0.42.0"
}

subprojects {
    repositories {
        google()
        jcenter()
    }

    apply(plugin = "com.diffplug.spotless")
    spotless {
        kotlin {
            target("**/*.kt")
            targetExclude("$buildDir/**/*.kt")
            targetExclude("bin/**/*.kt")

            ktlint("0.40.0")
            licenseHeaderFile(rootProject.file("spotless/copyright.kt"))
        }
    }
}