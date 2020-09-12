plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.0"
    id("com.orctom.archetype") version "1.4.8"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
}