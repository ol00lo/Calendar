package com.example.calendar.ui.main

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State

class MainViewModel : ViewModel() {

    private val _uiState = mutableStateOf(
        MainUiState(
            recentItems = listOf(
                TrackItem("Run", "🏃‍♀️"),
                TrackItem("Smoke", "🚬"),
                TrackItem("Yoga", "🧘‍♀️")
            )
        )
    )
    val uiState: State<MainUiState> = _uiState

    fun onTabSelected(tab: MainTab) {
        _uiState.value = _uiState.value.copy(
            selectedTab = tab
        )
    }

    fun onAddItemClick() {
        // TODO
    }

    fun onMenuClick() {
        // TODO
    }

    fun onAccountClick() {
        // TODO
    }
}
