package com.example.calendar.statistics

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.calendar.domain.model.TrackItem
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow

import com.example.calendar.domain.repository.TrackItemRepository

data class StatisticsUiState(
    val infoText: String = "Statistics coming soon..."
)

class StatisticsViewModel(
    repository: TrackItemRepository
) : ViewModel() {
    val trackedItems: StateFlow<List<TrackItem>> =
        repository.items.stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())

    var uiState by mutableStateOf(StatisticsUiState())
        private set
}