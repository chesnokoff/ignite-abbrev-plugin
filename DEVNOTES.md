* [Prerequisites](#prerequisites)
* [Building plugin](#building-plugin)
* [Testing in IDE](#testing-in-ide)
* [Available commands](#available-commands)
***

## Prerequisites
Before you begin, ensure you have:
- **Java 17**
- **Gradle 8.5** or higher
- **IntelliJ IDEA 2022.3** or higher (for development)
***

## Building plugin
Builds the plugin and generates a ZIP archive for deployment:
```shell
./gradlew clean buildPlugin
```
The output plugin archive will be created at: `build/distributions/ignite-abbrev-plugin-<version>.zip`
***

## Testing in IDE
Launches an IntelliJ IDEA instance with the plugin installed:
```shell
./gradlew runIde
```
***

## Available commands
View all available Gradle tasks with description:
```shell
./gradlew tasks
```
