plugins {
    // https://plugins.gradle.org/plugin/org.jetbrains.intellij
    id("org.jetbrains.intellij") version "1.17.3"
}

repositories {
    mavenCentral()
}

intellij {
    // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#platformVersions
    version.set("2024.1")
}

tasks {
    // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#platformVersions
    patchPluginXml {
        version.set("4.12")
        sinceBuild.set("233")
        untilBuild.set("")
    }

    publishPlugin {
        token.set(project.findProperty("intellijPublishToken").toString())
    }
}
