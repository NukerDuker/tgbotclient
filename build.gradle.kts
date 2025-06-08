import io.gitlab.arturbosch.detekt.Detekt

plugins {
	kotlin("jvm") version libs.versions.kotlin
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version libs.versions.spring
	id("io.spring.dependency-management") version "1.1.7"
	alias(libs.plugins.detekt)
	alias(libs.plugins.lombok)
}

group = "ru.sudokakado"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation(libs.jackson.core)
	implementation(libs.jackson.databind)
	implementation(libs.jackson.annotations)
	implementation(libs.spring.web)
	implementation(libs.spring.webflux)
	implementation(libs.kotlin.logging)
	implementation(libs.logback.classic)
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

detekt {
	toolVersion = "1.23.8"
	config.setFrom(file("config/detekt/detekt.yml"))
	buildUponDefaultConfig = true
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<Detekt>().configureEach {
	reports {
		xml.required.set(false)
		html.required.set(true)
		sarif.required.set(false)
		md.required.set(true)
	}
}

configurations.matching { it.name == "detekt" }.all {
	resolutionStrategy.eachDependency {
		if (requested.group == "org.jetbrains.kotlin") {
			useVersion("2.0.21")
		}
	}
}
