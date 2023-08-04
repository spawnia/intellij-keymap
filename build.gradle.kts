plugins {
    // https://plugins.gradle.org/plugin/org.jetbrains.intellij
    id("org.jetbrains.intellij") version "1.15.0"
}

repositories {
    mavenCentral()
}

intellij {
    // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#intellij-platform-based-products-of-recent-ide-versions
    version.set("2023.2")
}

tasks {
    // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#intellij-platform-based-products-of-recent-ide-versions
    patchPluginXml {
        version.set("4.9")
        sinceBuild.set("232")
    }

    publishPlugin {
        token.set(project.findProperty("intellijPublishToken").toString())
    }
}
