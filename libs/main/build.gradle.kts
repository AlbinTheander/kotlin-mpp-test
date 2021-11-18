plugins {
    kotlin("multiplatform") version "1.6.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js(LEGACY) {
        nodejs()
        // binaries.library()
    }
    jvm()

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":libs:utils"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(project(":libs:utils"))
            }
        }
    }
}
