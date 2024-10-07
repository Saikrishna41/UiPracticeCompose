package com.task.uipracticecompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun SettingScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.background(color = Color.Blue), contentAlignment = Alignment.Center) {
        Text(text = "SettingScreen", fontSize = 32.sp)
    }
}