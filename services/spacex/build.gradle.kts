import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    kotlin("jvm")
    kotlin("kapt")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
    testLogging {
        exceptionFormat = TestExceptionFormat.FULL
        events("started", "skipped", "passed", "failed")
        showStandardStreams = true
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libs.Kotlin.stdLib)
    implementation(Libs.Kotlin.coroutines)

    api(Libs.Network.Retrofit.networkResponseAdapter4)
    api(Libs.Network.OkHttp.mockWebServer)
    api(Libs.Network.OkHttp.okHttp)
    api(Libs.Network.Moshi.moshi)

    implementation(Libs.Network.Retrofit.retrofit)
    implementation(Libs.Network.Retrofit.scalarsConverter)
    implementation(Libs.Network.Retrofit.moshiConverter)
    kapt(Libs.Network.Moshi.codegen)

    testImplementation(Libs.Test.kotlinTest)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}