package com.example.calendar.navigation

sealed class AppRoute(val route: String) {
    object Home : AppRoute("Home")
    object Statistics : AppRoute("Statistics")
}