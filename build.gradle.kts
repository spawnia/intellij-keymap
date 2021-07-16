fun properties(key: String) = project.findProperty(key).toString()

plugins {
    // https://plugins.gradle.org/plugin/org.jetbrains.intellij
    id("org.jetbrains.intellij") version "1.1.3"
}

group "spawnia"
version "4.2"

repositories {
    mavenCentral()
}

// See https://github.com/JetBrains/gradle-intellij-plugin#intellij-platform-properties
intellij {
    // TODO use 2021.2
    // version.set("211.7628.21")
    version.set("2021.1")
}


tasks {
    // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#intellij-platform-based-products-of-recent-ide-versions
    patchPluginXml {
        sinceBuild.set("211")
        untilBuild.set("211.*")
    }

    runPluginVerifier {
        ideVersions.set(listOf("2021.1"))
    }

    publishPlugin {
        token.set(properties("intellijPublishToken"))
    }
}
