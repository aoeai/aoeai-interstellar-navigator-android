package com.aoeai.isn.random_result.bagua.data

import androidx.compose.ui.graphics.Color

data class YinYaoDto internal constructor(
    override val leftRightColor: Color,
    override val middleColor: Color
) : YaoDto {
    override val value: Byte = 0
}
