package com.aoeai.isn.twelve_chinese_zodiac_animals.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.aoeai.isn.common.ui.ControlPanel
import com.aoeai.isn.twelve_chinese_zodiac_animals.data.TwelveChineseZodiacAnimalsCreator

@Composable
fun TwelveChineseZodiacAnimalsView() {
    var count by remember { mutableIntStateOf(1) }
    var signs by remember { mutableStateOf(TwelveChineseZodiacAnimalsCreator.randomList(count)) }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = signs.joinToString(" "),
            fontSize = 60.sp,
            color = Color.Black,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
            lineHeight = 70.sp
        )

        ControlPanel(
            modifier = Modifier.align(Alignment.BottomCenter),
            onCountSelected = { count = it },
            initialCount = count,
            counts = (1..9).toList()
        ) { signs = TwelveChineseZodiacAnimalsCreator.randomList(count) }
    }
}

@Preview(showBackground = true)
@Composable
fun TTwelveChineseZodiacAnimalsPreview() {
    com.aoeai.isn.ui.theme.InterstellarNavigatorTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            TwelveChineseZodiacAnimalsView()
        }
    }
}