package com.example.calendar.app

import com.example.calendar.navigation.AppRoute

enum class AppTab(
    val route: String,
    val title: String
) {
    HOME(AppRoute.Home.route, "Home"),
    STATISTICS(AppRoute.Statistics.route, "Statistics"),
}