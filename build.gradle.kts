plugins {
    // https://plugins.gradle.org/plugin/org.jetbrains.intellij
    id("org.jetbrains.intellij") version "1.17.2"
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
        version.set("4.11")
        sinceBuild.set("233")
        untilBuild.set("241")
    }

    publishPlugin {
        token.set(project.findProperty("intellijPublishToken").toString())
    }
}
