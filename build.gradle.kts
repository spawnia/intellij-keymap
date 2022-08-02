plugins {
    // https://plugins.gradle.org/plugin/org.jetbrains.intellij
    id("org.jetbrains.intellij") version "1.7.0"
}

repositories {
    mavenCentral()
}

// https://github.com/JetBrains/gradle-intellij-plugin#intellij-platform-properties
intellij {
    version.set("2022.2")
}

tasks {
    // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#intellij-platform-based-products-of-recent-ide-versions
    patchPluginXml {
        version.set("4.6")
        sinceBuild.set("211")
    }

    publishPlugin {
        token.set(project.findProperty("intellijPublishToken").toString())
    }
}
