package com.task.uipracticecompose

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object HomeScreen :
        BottomBarScreen(route = "home", title = "Home", icon = Icons.Default.Home)

    data object ProfileScreen :
        BottomBarScreen(route = "profile", title = "Profile", icon = Icons.Default.Person)

    data object SettingsScreen :
        BottomBarScreen(route = "settings", title = "Settings", icon = Icons.Default.Settings)
}