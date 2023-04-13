// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    id 'com.android.application' version '7.4.2' apply false
//    id 'com.android.library' version '7.4.2' apply false
//    id 'org.jetbrains.kotlin.android' version '1.8.0' apply false
//}
//apply plugin: "com.vanniktech.maven.publish"
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
//    apply(from =  "flavor-plugin.gradle.kts")
    repositories {
        maven { url = uri("https://jitpack.io") }
        google()
        mavenCentral()
//        maven {
//            url = uri("https://artifactory.nioint.com/artifactory/dd-maven-public-virtual/")
//        }
    }

    configurations.classpath {
        // check for updates every time
        resolutionStrategy.cacheChangingModulesFor(0, TimeUnit.SECONDS)
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
//        classpath("com.nio.android.lego:lg-common-gradle-plugin:2.9.0-SNAPSHOT")
//        classpath("com.nio.android.lego:lg-deps-gradle-plugin:2.9.0-SNAPSHOT")
//        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5")
        classpath("com.vanniktech:gradle-maven-publish-plugin:0.19.0")
    }
}

subprojects {
    repositories {
//        maven {
//            url = uri("https://artifactory.nioint.com/artifactory/dd-maven-public-virtual/")
//        }
        maven { url = uri("https://jitpack.io") }
        google()
        mavenCentral()
        mavenLocal()
    }

    configurations.all {
        resolutionStrategy {
            cacheChangingModulesFor(0, TimeUnit.SECONDS)
        }
    }
//    this.getTasksByName("android",false) {
//        missingDimensionStrategy ("channel", "second")
//    }
}