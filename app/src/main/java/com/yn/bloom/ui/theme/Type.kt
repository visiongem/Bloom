package com.yn.bloom.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.yn.bloom.R

// 声明 Nunito Sans 字体家族
val nunitoSansFamily = FontFamily(
    Font(R.font.nunitosans_light, FontWeight.Light),
    Font(R.font.nunitosans_semibold, FontWeight.SemiBold),
    Font(R.font.nunitosans_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val bloomTypography = Typography(
    h1 = TextStyle(
        fontSize = 18.sp,
        fontFamily = nunitoSansFamily,
        fontWeight = FontWeight.Bold
    ),

    h2 = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.15.sp,
        fontFamily = nunitoSansFamily,
        fontWeight = FontWeight.Bold
    ),

    caption = TextStyle(
        fontSize = 12.sp,
        fontFamily = nunitoSansFamily,
        fontWeight = FontWeight.SemiBold
    ),

    subtitle1 = TextStyle(
        fontSize = 16.sp,
        fontFamily = nunitoSansFamily,
        fontWeight = FontWeight.Light
    ),

    button = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 1.sp,
        fontFamily = nunitoSansFamily,
        fontWeight = FontWeight.SemiBold,
        color = white
    ),

    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    body2 = TextStyle(
        fontSize = 12.sp,
        fontFamily = nunitoSansFamily,
        fontWeight = FontWeight.Light
    )
)


