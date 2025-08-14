package com.hyunuk.compose_sdp

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

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

// Float 확장 함수 - 세로 비율 sp
@Composable
fun Float.ssp_h(): TextUnit {
    val heightRatio = LocalHeightRatio.current
    return (this * heightRatio).sp
}

// Float 확장 함수 - 가로 비율 sp
@Composable
fun Float.ssp_w(): TextUnit {
    val widthRatio = LocalWidthRatio.current
    return (this * widthRatio).sp
}

// Int 확장 함수 - 세로 비율 sp
@Composable
fun Int.ssp_h(): TextUnit = this.toFloat().ssp_h()

// Int 확장 함수 - 가로 비율 sp
@Composable
fun Int.ssp_w(): TextUnit = this.toFloat().ssp_w()