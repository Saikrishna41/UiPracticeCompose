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
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(modifier =  modifier.background(color = Color.Gray), contentAlignment = Alignment.Center) {
        Text(text = "HomeScreen", fontSize = 32.sp)
    }
}