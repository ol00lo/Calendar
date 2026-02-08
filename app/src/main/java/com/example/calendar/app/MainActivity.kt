package com.example.calendar.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.calendar.navigation.AppNavGraph
import com.example.calendar.ui.theme.CalendarTheme

class MainActivity : ComponentActivity() {

    private val appContainer = AppContainer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalendarTheme {
                val navController = rememberNavController()
                AppScaffold(
                    navController = navController,
                    onMenuClick = {},
                    onAccountClick = {}
                ) { padding ->
                    AppNavGraph(
                        navController = navController,
                        padding = padding,
                        repository = appContainer.trackItemRepository
                    )
                }
            }
        }
    }
}
