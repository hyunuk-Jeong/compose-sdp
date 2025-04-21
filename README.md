
# 📱 compose-sdp

**compose-sdp**는 Jetpack Compose 기반의 Android 프로젝트에서 **기기 해상도에 맞춰 dp 값을 자동으로 조정**할 수 있도록 도와주는 경량 유틸리티 라이브러리입니다.

디바이스 화면 크기에 따라 적절한 비율로 UI 크기를 조정하여 **다양한 화면에서도 일관된 UI**를 구성할 수 있습니다.

---

## ✨ Features

- ✅ 화면 너비/높이 비율 기반 dp 계산
- ✅ Jetpack Compose에서 간편하게 사용
- ✅ `Float`, `Int` 타입 모두 지원
- ✅ 다양한 해상도에서도 일관된 디자인 보장
- ✅ `sdp_h()` / `sdp_w()` 함수 제공

---

## 🛠 Installation

### 1. `build.gradle.kts` (Project level)

```kotlin
repositories {
    google()
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}
```

### 2. `build.gradle.kts` (Module level)

```kotlin
dependencies {
    implementation("com.github.hyunuk-Jeong.compose-sdp:v1.0.04")
}
```

📌 최신 버전은 [JitPack](https://jitpack.io/#hyunuk-Jeong/compose-sdp)에서 확인하세요.

---

## 📦 Usage

### 기본 사용법

```kotlin
import com.hyunuk.compose_sdp.sdp_w
import com.hyunuk.compose_sdp.sdp_h

@Composable
fun SampleScreen() {
    Box(
        modifier = Modifier
            .padding(16.sdp_w())  // 가로 비율 기준 padding
            .height(100.sdp_h())  // 세로 비율 기준 height
    ) {
        Text("Hello Compose")
    }
}
```

## 🧠 내부 동작 원리

- 현재 디바이스의 **실제 해상도 기준 너비/높이**를 바탕으로 기준 해상도 대비 비율을 계산합니다.
- 기준 해상도는 일반적으로 `360dp x 640dp` (혹은 `392dp x 851dp`) 등으로 설정됩니다.
- 계산된 비율을 기반으로 `dp` 값을 동적으로 변환하여 리턴합니다.
- 사용자 임의로 디자인(figma, adobe 등) 기준에 맞게 Sdp 사이즈를 정의할 수도 있습니다.

```kotlin
SdpInit(375,845) {
    {Component}
}
```

---

## 📜 License

MIT License

Copyright (c) 2025 Jeong Hyunuk

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


---

## 👨‍💻 Author

- **Jeong Hyunuk**
- GitHub: [@hyunuk-Jeong](https://github.com/hyunuk-Jeong)
