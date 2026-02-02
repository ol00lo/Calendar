package com.example.calendar.home

import java.time.LocalDate

import com.example.calendar.domain.model.TrackItem

data class HomeUiState(
    val selectedDate: LocalDate = LocalDate.now(),
    val recentItems: List<TrackItem> = emptyList(),
    val selectedItemsToday: List<TrackItem> = emptyList(),
    val isDialogOpen: Boolean = false
)
