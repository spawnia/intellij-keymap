plugins {
    // https://plugins.gradle.org/plugin/org.jetbrains.intellij
    id("org.jetbrains.intellij") version "1.13.3"
}

repositories {
    mavenCentral()
}

// https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#intellij-platform-based-products-of-recent-ide-versions
intellij {
    version.set("2023.1")
}

tasks {
    // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#intellij-platform-based-products-of-recent-ide-versions
    patchPluginXml {
        version.set("4.8")
        sinceBuild.set("211")
    }

    publishPlugin {
        token.set(project.findProperty("intellijPublishToken").toString())
    }
}
