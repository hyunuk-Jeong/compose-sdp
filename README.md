
# compose-sdp

`compose-sdp` is an Android library that provides UI components based on [Jetpack Compose](https://developer.android.com/jetpack/compose). This library helps you easily use various UI elements in a Compose-style manner.

## Installation

This library is distributed via JitPack, and you can add it to your project via Gradle.

### 1. Add JitPack Repository

Add the JitPack repository in your `build.gradle.kts` file:

```kotlin
repositories {
    google()
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}
```

### 2. Add Dependency

Add the following dependency in your `build.gradle.kts` file:

```kotlin
dependencies {
    implementation("com.github.hyunuk-Jeong.compose-sdp:v1.0.0")
}
```

Make sure to replace `v1.0.0` with the version of the library you wish to use. You can check for the latest version on [JitPack](https://jitpack.io/#hyunuk-Jeong/compose-sdp).

## Usage

Here’s an example of how to use the library in your project.

### Example 1: Using Compose UI Elements

```kotlin
import com.hyunuk.compose_sdp.YourComponent

@Composable
fun ExampleScreen() {
    YourComponent(
        modifier = Modifier.fillMaxSize(),
        // other parameters
    )
}
```

### Example 2: Utilizing Various Features

Use the different UI components and features provided by the library to efficiently design the UI for your Android app.

## Versioning

This library follows [SemVer](https://semver.org/) (Semantic Versioning). You can check for the latest version on [JitPack](https://jitpack.io/#hyunuk-Jeong/compose-sdp).

## License

This library is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Contact

- **Author:** Hyunuk Jeong
- **GitHub Repository:** [https://github.com/hyunuk-Jeong/compose-sdp](https://github.com/hyunuk-Jeong/compose-sdp)
