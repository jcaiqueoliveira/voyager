plugins {
    kotlin("android")
    kotlin("kapt")
    id("com.android.library")
    id("com.vanniktech.maven.publish")
}

setupModuleForAndroidxCompose()

android {
    namespace = "cafe.adriel.voyager.hilt"
    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
    }
}

kapt {
    correctErrorTypes = true
}

dependencies {
    api(projects.voyagerAndroidx)
    api(projects.voyagerNavigator)

    implementation(libs.compose.runtime)
    implementation(libs.compose.ui)
    implementation(libs.lifecycle.savedState)
    implementation(libs.lifecycle.viewModelKtx)
    implementation(libs.hilt.android)
    implementation(libs.lifecycle.viewModelCompose)
    kapt(libs.hilt.compiler)

    testRuntimeOnly(libs.junit.engine)
    testImplementation(libs.junit.api)
}
