pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("$rootDir/org.thepalaceproject.android.platform/build_libraries.toml"))
        }
    }

    repositories {
        mavenCentral()
        google()
    }
}

rootProject.name = "org.thepalaceproject.theme"

include(":core")
include(":sandbox")
