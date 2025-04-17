package com.hyunuk.compose_sdp

import android.util.DisplayMetrics
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp

// CompositionLocal로 비율 정보를 전달
val LocalWidthRatio = compositionLocalOf { 1f }
val LocalHeightRatio = compositionLocalOf { 1f }

// SdpInit: 디자인 기준 크기 (디자인에서의 가로, 세로)와 실제 디바이스 크기를 비교하여 크기 비율을 계산
@Composable
fun SdpInit(designWidth: Int, designHeight: Int, content: @Composable () -> Unit) {
    // 현재 디바이스 화면의 크기 (픽셀 단위)
    val context = LocalContext.current
    val density = LocalDensity.current.density
    val displayMetrics: DisplayMetrics = context.resources.displayMetrics

    val screenWidth = displayMetrics.widthPixels / density // 디바이스의 화면 너비 (dp 단위로 변환)
    val screenHeight = displayMetrics.heightPixels / density // 디바이스의 화면 높이 (dp 단위로 변환)

    // 화면 크기 비율을 계산 (디바이스 화면 크기 / 디자인 기준 크기)
    val widthRatio = screenWidth / designWidth.toFloat()
    val heightRatio = screenHeight / designHeight.toFloat()

    // 비율을 CompositionLocal을 통해 다른 컴포저블에 전달
    CompositionLocalProvider(
        LocalWidthRatio provides widthRatio,
        LocalHeightRatio provides heightRatio
    ) {
        content() // UI 구성 요소
    }
}

// Dp 확장 함수 - 세로 비율에 맞춰 크기 변환
@Composable
fun Dp.sdp_h(): Dp {
    val heightRatio = LocalHeightRatio.current
    return this * heightRatio
}

// Dp 확장 함수 - 가로 비율에 맞춰 크기 변환
@Composable
fun Dp.sdp_w(): Dp {
    val widthRatio = LocalWidthRatio.current
    return this * widthRatio
}
