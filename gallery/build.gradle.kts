import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


group = "com.sq.image.gallery"
version = "1.0"

buildscript {

    val kotlinVersion = "1.2.50"

    repositories {
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}") // Required for Kotlin integration
        classpath("org.jetbrains.kotlin:kotlin-allopen:${kotlinVersion}") // See https://kotlinlang.org/docs/reference/compiler-plugins.html#kotlin-spring-compiler-plugin
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.3.RELEASE")
    }
}

plugins {

    val kotlinVersion = "1.2.50"

    kotlin("jvm") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion

    id("org.springframework.boot") version "2.0.3.RELEASE"
    id("io.spring.dependency-management") version "1.0.5.RELEASE"
}

apply {
    plugin("org.springframework.boot")
}

repositories {
    jcenter()
    mavenCentral()
    maven("https://repo.spring.io/milestone")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    compile(kotlin("stdlib"))
    compile("org.jetbrains.kotlin:kotlin-reflect")

    compile("org.springframework.boot:spring-boot-starter-web") {
        exclude(module = "spring-boot-starter-validation")
    }
    compile("org.springframework.boot:spring-boot-starter-thymeleaf")
    compile("org.springframework.boot:spring-boot-devtools")

    compile ("org.apache.logging.log4j:log4j-api:2.11.0")
    compile ("org.apache.logging.log4j:log4j-core:2.11.0")

    compile ("com.google.cloud:google-cloud-storage:1.35.0")


    testCompile("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    testCompile("org.assertj:assertj-core:3.9.1")
}