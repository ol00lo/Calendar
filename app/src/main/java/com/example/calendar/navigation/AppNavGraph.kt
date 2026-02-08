package com.example.calendar.navigation

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.calendar.domain.repository.TrackItemRepository

import com.example.calendar.home.HomeScreen
import com.example.calendar.statistics.StatisticsScreen


@Composable
fun AppNavGraph(
    navController: NavHostController,
    padding: PaddingValues,
    repository: TrackItemRepository,
    startDestination: String = AppRoute.Home.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Screen.Home.route) {
            HomeScreen(padding = padding, repository = repository)
        }

        composable(Screen.Statistics.route) {
            StatisticsScreen(padding = padding, repository = repository)
        }
    }
}