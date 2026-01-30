package com.example.calendar.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calendar.home.HomeScreen
import com.example.calendar.home.HomeViewModel
import com.example.calendar.ui.theme.CalendarTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalendarTheme {
                val viewModel: HomeViewModel = viewModel()
                val state = viewModel.uiState.value

                var currentTab by remember {mutableStateOf(AppTab.HOME)}

                AppScaffold(
                    currentTab = currentTab,
                    onTabSelected = {currentTab = it},
                    onMenuClick = viewModel::onMenuClick,
                    onAccountClick = viewModel::onAccountClick

                ) { padding->
                    HomeScreen(
                        state=state,
                        padding=padding,
                        onAddItemClick = viewModel::onAddItemClick
                    )
                }
            }
        }

    }
}