plugins {
    id("java")
    id("java-library")
    id("maven-publish")
    id("io.spring.dependency-management") version "1.1.7"
}

description = "Shared DTOs and Common Utilities for Bakery Microservices"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

repositories {
    mavenCentral()
}

extra["springCloudVersion"] = "2025.0.3"

dependencyManagement {
    imports {
        mavenBom("org.springframework.boot:spring-boot-dependencies:3.5.15")
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

dependencies {
    api("org.springframework.boot:spring-boot-starter-security")
    api("org.springframework.boot:spring-boot-starter-web")
    api("org.springframework.boot:spring-boot-starter-validation")
    api("org.springframework.boot:spring-boot-starter-cache")
    api("com.github.ben-manes.caffeine:caffeine")
    compileOnly("org.springframework.cloud:spring-cloud-starter-openfeign")
    compileOnly("jakarta.servlet:jakarta.servlet-api:6.1.0")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                name.set("Bakery Common Libs")
                description.set("Shared DTOs and Common Utilities for Bakery Microservices")
                url.set("https://github.com/amankrmj09/bakery-common-libs")
                licenses {
                    license {
                        name.set("The MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                developers {
                    developer {
                        id.set("amankrmj09")
                    }
                }
            }
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/amankrmj09/bakery-common-libs")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

tasks.withType<GenerateModuleMetadata> {
    suppressedValidationErrors.add("dependencies-without-versions")
}