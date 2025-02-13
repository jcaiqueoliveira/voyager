buildscript {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev" )
    }

    dependencies {
        classpath(libs.plugin.hilt)
        classpath(libs.plugin.ktlint)
        classpath(libs.plugin.maven)
        classpath(libs.plugin.multiplatform.compose)
    }
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")

    configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
        version.set("0.47.1")
        disabledRules.set(setOf("filename"))
    }
}
