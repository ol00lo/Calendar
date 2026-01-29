package com.example.calendar.ui.main

import java.time.LocalDate

data class MainUiState(
    val selectedDate: LocalDate = LocalDate.now(),
    val recentItems: List<TrackItem> = emptyList(),
    val selectedItemsToday: List<TrackItem> = emptyList(),
    val selectedTab: MainTab = MainTab.HOME
)
