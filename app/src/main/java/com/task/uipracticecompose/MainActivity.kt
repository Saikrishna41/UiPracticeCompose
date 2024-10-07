package com.task.uipracticecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.task.uipracticecompose.ui.theme.UiPracticeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            UiPracticeComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    bottomBar = { BottomBar(navController = navController) }) { innerPadding ->
                    BottomNavGraph(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        navController = navController
                    )
                }
            }
        }
    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val currentNavState by navController.currentBackStackEntryAsState()
    val destination = currentNavState?.destination
    val screens = listOf(
        BottomBarScreen.HomeScreen,
        BottomBarScreen.ProfileScreen,
        BottomBarScreen.SettingsScreen,
    )
    BottomNavigation {
        screens.forEach { screen ->
            AddItem(
                screens = screen,
                navController = navController,
                destination = destination
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screens: BottomBarScreen,
    navController: NavHostController,
    destination: NavDestination?
) {
    BottomNavigationItem(
        label = { Text(text = screens.title) },
        selected = destination?.hierarchy?.any {
            it.route == screens.route
        } == true,
        onClick = {
            navController.navigate(screens.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        },
        icon = { Icon(imageVector = screens.icon, contentDescription = "") })
}