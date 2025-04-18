package com.hyunuk.compose_sdp

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// Float 확장 함수 - 세로 비율
@Composable
fun Float.sdp_h(): Dp {
    val heightRatio = LocalHeightRatio.current
    return (this * heightRatio).dp
}

@Composable
fun Float.sdp_w(): Dp {
    val widthRatio = LocalWidthRatio.current
    return (this * widthRatio).dp
}

// Int 확장 함수 - 세로 비율
@Composable
fun Int.sdp_h(): Dp = this.toFloat().sdp_h()

@Composable
fun Int.sdp_w(): Dp = this.toFloat().sdp_w()