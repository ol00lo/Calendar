package com.example.calendar.statistics

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.SharingStarted

import com.example.calendar.app.TrackItemStore

data class StatisticsUiState(
    val infoText: String = "Statistics coming soon..."
)

class StatisticsViewModel : ViewModel() {
    val trackedItems = TrackItemStore.items
        .stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())

    var uiState by mutableStateOf(StatisticsUiState())
        private set
}