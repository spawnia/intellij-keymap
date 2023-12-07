plugins {
    // https://plugins.gradle.org/plugin/org.jetbrains.intellij
    id("org.jetbrains.intellij") version "1.16.1"
}

repositories {
    mavenCentral()
}

intellij {
    // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#platformVersions
    version.set("2023.3")
}

tasks {
    // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#platformVersions
    patchPluginXml {
        version.set("4.10")
        sinceBuild.set("233")
    }

    publishPlugin {
        token.set(project.findProperty("intellijPublishToken").toString())
    }
}
