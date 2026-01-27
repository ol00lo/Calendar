package com.example.calendar.ui.navigation

import com.example.calendar.ui.calendar.CalendarScreen
import com.example.calendar.ui.main.MainScreen
import com.example.calendar.ui.main.MainViewModel

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.MAIN
    ) {
        composable(Routes.MAIN) {
            val viewModel: MainViewModel = viewModel()
            MainScreen(
                viewModel = viewModel,
                onOpenCalendar = { navController.navigate(Routes.CALENDAR) }
            )
        }

        composable(Routes.CALENDAR) {
            CalendarScreen()
        }
    }
}