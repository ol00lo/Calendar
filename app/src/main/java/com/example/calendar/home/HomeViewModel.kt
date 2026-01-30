package com.example.calendar.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State
import com.example.calendar.domain.model.TrackItem
import com.example.calendar.app.AppTab

class HomeViewModel : ViewModel() {

    private val _uiState = mutableStateOf(
        HomeUiState(
            recentItems = listOf(
                TrackItem("Run", "🏃‍♀️"),
                TrackItem("Smoke", "🚬"),
                TrackItem("Yoga", "🧘‍♀️")
            )
        )
    )
    val uiState: State<HomeUiState> = _uiState

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
