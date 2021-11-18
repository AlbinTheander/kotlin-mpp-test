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
        // Ture
        // To build distributions for and run tests on browser or Node.js use one or both of:
        nodejs()
        // binaries.library()
    }
    jvm()

    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test")) // This brings all the platform dependencies automatically
            }
        }
        val commonMain by getting {
            dependencies {
                runtimeOnly(npm("kotlin", "1.5.0"))
            }
        }
    }

//    sourceSets {
//        val commonTest by getting {
//            dependencies {
//                implementation(kotlin("test-common"))
//                implementation(kotlin("test-annotations-common"))
//            }
//        }
//        val jvmMain by getting
//        val jvmTest by getting {
//            dependencies {
//                implementation(kotlin("test-junit"))
//            }
//        }
//        val jsMain by getting
//        val jsTest by getting {
//            dependencies {
//                implementation(kotlin("test-js"))
//            }
//        }
//
//    }
}