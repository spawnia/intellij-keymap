# intellij-keymap

The preferred Intellij IDE keymap of Benedikt Franke

This plugin is essentially a workaround for https://youtrack.jetbrains.com/issue/IDEA-184607/Can-not-share-custom-keymap-configuration,
allowing me to share my preferred keymap across multiple Intellij based IDEs on multiple devices.
It is designed for my personal use and thus does not include documentation.

I will probably delete it once Jetbrains provides a working and supported way of sharing keymaps.

## Setup

    cp gradle.properties.example gradle.properties

## Publish

Bump the version in [build.gradle.kts](build.gradle.kts) and run:

    gradle publishPlugin

To ensure compatibility with new Intellij platform releases, bump the version at https://plugins.jetbrains.com/plugin/14127-spawnia-keymap/edit/versions
to allow the latest branch number from https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#platformVersions.

## Docs

https://github.com/JetBrains/intellij-platform-plugin-template
