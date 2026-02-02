package com.example.calendar.app

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun AppScaffold(
    navController: NavHostController,
    onMenuClick: () -> Unit,
    onAccountClick: () -> Unit,
    content: @Composable (PaddingValues) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry.value?.destination?.route

    val currentTab = AppTab.entries.firstOrNull {
        it.route == currentRoute
    } ?: AppTab.HOME

    Scaffold(
        topBar = {
            AppTopBar(
                title = "ebaaCalendar",
                onMenuClick = onMenuClick,
                onAccountClick = onAccountClick
            )
        },
        bottomBar = {
            AppBottomBar(
                currentTab = currentTab,
                onTabSelected = { tab ->
                    navController.navigate(tab.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        },
        content = content
    )
}
