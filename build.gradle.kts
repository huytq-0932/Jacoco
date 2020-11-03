// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    apply(from = "ktlint.gradle.kts")
    apply(from = "$rootDir/team-props/git-hooks.gradle.kts")

    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
    //    classpath("io.gitlab.arturbosch.detekt:1.9.1")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://www.jitpack.io")
    }
}

task<Delete>("clean") {
    delete = setOf(rootProject.buildDir)
}
