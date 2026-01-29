package com.example.calendar.ui.main

import com.example.calendar.ui.theme.CalendarTheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalendarTheme {
                val viewModel: MainViewModel = viewModel()
                val state = viewModel.uiState.value

                MainScreen(
                    state = state,
                    onMenuClick = viewModel::onMenuClick,
                    onAccountClick = viewModel::onAccountClick,
                    onAddItemCLick = viewModel::onAddItemClick,
                    onTabSelected = viewModel::onTabSelected
                )
            }
        }

    }
}



