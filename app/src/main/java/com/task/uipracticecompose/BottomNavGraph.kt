package com.task.uipracticecompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.task.uipracticecompose.screens.HomeScreen
import com.task.uipracticecompose.screens.ProfileScreen
import com.task.uipracticecompose.screens.SettingScreen

@Composable
fun BottomNavGraph(modifier: Modifier = Modifier, navController : NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreen.HomeScreen.route) {
        composable(route = BottomBarScreen.HomeScreen.route) {
            HomeScreen(modifier)
        }
        composable(route = BottomBarScreen.ProfileScreen.route) {
            ProfileScreen(modifier)
        }
        composable(route = BottomBarScreen.SettingsScreen.route) {
            SettingScreen(modifier)
        }
    }
}