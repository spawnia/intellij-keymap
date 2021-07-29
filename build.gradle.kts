fun properties(key: String) = project.findProperty(key).toString()

plugins {
    // https://plugins.gradle.org/plugin/org.jetbrains.intellij
    id("org.jetbrains.intellij") version "1.1.3"
}

repositories {
    mavenCentral()
}

// See https://github.com/JetBrains/gradle-intellij-plugin#intellij-platform-properties
intellij {
    version.set("2021.2")
}

tasks {
    // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#intellij-platform-based-products-of-recent-ide-versions
    patchPluginXml {
        version.set("4.2")
        sinceBuild.set("211")
        untilBuild.set("212.*")
    }

    publishPlugin {
        token.set(properties("intellijPublishToken"))
    }
}
