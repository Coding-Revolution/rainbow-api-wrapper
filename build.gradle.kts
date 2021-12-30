import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.ir.backend.js.compile


plugins {
    kotlin("jvm") version "1.6.0"
    `maven-publish`
}

group = "it.necross"
version = "1.0.2"
val projectVersion = project.version

if (project.hasProperty("publish.snapshot")) {
    project.version = "$projectVersion-SNAPSHOT"
} else {
    project.version = "$projectVersion-rc"
}

// publish repository to sonatype nexus server (https://nexus.coding-revolution.com/)

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifactId = "RainbowWrapper"
            from(components["java"])
            versionMapping {
                usage("java-api") {
                    fromResolutionOf("runtimeClasspath")
                }
                usage("java-runtime") {
                    fromResolutionResult()
                }
            }
            pom {
                name.set("Rainbow Six Siege Kotlin Wrapper")
                description.set("Wrapper representation the rainbow six siege api")
                url.set("https://necross.it")
                developers {
                    developer {
                        id.set("CerberusIT")
                        name.set("Kelvin Bill")
                        email.set("kelvin.bill@necross.it")
                    }
                }
            }
        }
    }
    repositories {
        maven {
            // change URLs to point to your repos, e.g. http://my.org/repo
            val releasesRepoUrl = uri("https://nexus.coding-revolution.com/repository/rainbow-kotlin-wrapper-release/")
            val snapshotsRepoUrl = uri("https://nexus.coding-revolution.com/repository/rainbow-kotlin-wrapper-snapshot/")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl

            // load credentials from environment variables
            credentials {
                username = System.getenv("NEXUS_USERNAME")
                password = System.getenv("NEXUS_PASSWORD")
            }
        }
    }
}

tasks.javadoc {
    if (JavaVersion.current().isJava9Compatible) {
        (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
    }
}

dependencies {
    // https://mvnrepository.com/artifact/com.google.code.gson/gson
    implementation("com.google.code.gson:gson:2.8.9")

    // https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp
    implementation("com.squareup.okhttp3:okhttp:3.8.1")
    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:2.0.0-alpha4")

    implementation("org.javacord:javacord:3.3.2")

    implementation ("io.socket:socket.io-client:2.0.1")
    // https://mvnrepository.com/artifact/net.oneandone.reflections8/reflections8
    implementation("net.oneandone.reflections8:reflections8:0.11.7")

}

java {
    withSourcesJar()
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "13"
}