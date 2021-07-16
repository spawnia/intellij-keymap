# intellij-keymap

The preferred Intellij IDE keymap of Benedikt Franke

This plugin is essentially a workaround for https://youtrack.jetbrains.com/issue/IDEA-181599,
allowing me to share my preferred keymap across multiple Intellij based IDEs on multiple devices.
It is designed for my personal use and thus does not include documentation.

I will probably delete it once Jetbrains provides a working and supported way of sharing keymaps.

## Setup

    cp gradle.properties.example gradle.properties

## Publish

Bump the version in [build.gradle](build.gradle.kts) and run:

    gradle publishPlugin

## Docs

https://github.com/JetBrains/intellij-platform-plugin-template
