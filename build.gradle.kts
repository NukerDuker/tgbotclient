plugins {
	kotlin("jvm") version libs.versions.kotlin
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version libs.versions.spring
	id("io.spring.dependency-management") version "1.1.7"
	checkstyle
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
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
