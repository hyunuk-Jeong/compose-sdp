package com.hyunuk.compose_sdp

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp

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