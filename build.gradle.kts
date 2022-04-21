plugins {
    // https://plugins.gradle.org/plugin/org.jetbrains.intellij
    id("org.jetbrains.intellij") version "1.5.3"
}

repositories {
    mavenCentral()
}

// https://github.com/JetBrains/gradle-intellij-plugin#intellij-platform-properties
intellij {
    version.set("2022.1")
}

tasks {
    // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#intellij-platform-based-products-of-recent-ide-versions
    patchPluginXml {
        version.set("4.5")
        sinceBuild.set("211")
    }

    publishPlugin {
        token.set(project.findProperty("intellijPublishToken").toString())
    }
}
