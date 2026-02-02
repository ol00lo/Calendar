package com.example.calendar.navigation

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.PaddingValues
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.example.calendar.home.HomeScreen
import com.example.calendar.statistics.StatisticsScreen


@Composable
fun AppNavGraph(
    navController: NavHostController,
    padding: PaddingValues,
    startDestination: String = AppRoute.Home.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Screen.Home.route) {
            HomeScreen(padding = padding, viewModel = viewModel())
        }

        composable(Screen.Statistics.route) {
            StatisticsScreen(padding = padding, viewModel = viewModel())
        }
    }
}