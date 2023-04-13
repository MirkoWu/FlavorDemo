plugins {
    id("kotlin-android")
    id("kotlin-kapt")
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
}
//apply (from= project.rootProject.uri("flavor-plugin.gradle"))

android {
    namespace = "com.example.flavordemo"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.flavordemo"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

//        missingDimensionStrategy ("channel", "first","second")
//        missingDimensionStrategy ("channel", "second")

    }

    buildTypes {
//        release {
//            minifyEnabled =  false
//            proguardFiles  getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
//        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

//    定义风味维度
    flavorDimensions ("channel")

    //声明产品风味
    productFlavors {
        //声明风味
       create("first"){
            //指定风味维度
            dimension = "channel"
            missingDimensionStrategy ("channel", "first")
        }
        create("second") {
            dimension = "channel"
            missingDimensionStrategy ("channel", "second")
        }
    }

}


dependencies {

    implementation ("androidx.core:core-ktx:1.7.0")
    implementation ("androidx.appcompat:appcompat:1.4.1")
    implementation ("com.google.android.material:material:1.5.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.3")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    implementation(project(":lib"))
    implementation(project(":lib2"))
//    implementation ("com.mirko.android:lib:1.0.0-SNAPSHOT")
//    implementation ("com.mirko.android:lib2.second:1.0.0-SNAPSHOT")
}