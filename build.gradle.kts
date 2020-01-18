buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.60")
    }
}
plugins {

    kotlin("jvm") version "1.3.60"
    application
}


application {
    mainClassName = "com.tinder.request.CircleCiRequest"
}
//sourceSets {
//    main.kotlin.srcDirs = ['src']
//    main.resources.srcDirs = ['resources']
//}

repositories {
    jcenter()
    mavenCentral()
    maven { setUrl("https://dl.bintray.com/kotlin/ktor") }
    maven { setUrl( "https://kotlin.bintray.com/kotlinx") }
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.60")
    compile("io.ktor:ktor-client-serialization:1.3.0")
    implementation("io.ktor:ktor-client-serialization-jvm:1.3.0")
    compile("io.ktor:ktor-client-core:1.3.0")
    compile("com.squareup.okhttp3:okhttp:4.3.1")
    compile("io.ktor:ktor-client-json-jvm:1.3.0")
    implementation("io.ktor:ktor-client-cio:1.3.0")


}