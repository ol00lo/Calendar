package com.example.calendar.navigation

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.example.calendar.home.HomeScreen
import com.example.calendar.statistics.StatisticsScreen


@Composable
fun AppNavGraph(
    navController: NavHostController,
    padding: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = AppRoute.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(padding = padding)
        }

        composable(Screen.Statistics.route) {
            StatisticsScreen(padding = padding)
        }
    }
}