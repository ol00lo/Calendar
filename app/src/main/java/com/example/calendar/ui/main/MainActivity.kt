package com.example.calendar.ui.main

import com.example.calendar.ui.navigation.AppNavHost
import com.example.calendar.ui.theme.CalendarTheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalendarTheme {
                val navController = rememberNavController()
                AppNavHost(navController = navController)
            }
        }

    }
}
