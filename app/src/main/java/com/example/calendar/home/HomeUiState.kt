package com.example.calendar.home

import com.example.calendar.domain.model.TrackItem
import com.example.calendar.app.AppTab
import java.time.LocalDate

data class HomeUiState(
    val selectedDate: LocalDate = LocalDate.now(),
    val recentItems: List<TrackItem> = emptyList(),
    val selectedItemsToday: List<TrackItem> = emptyList(),
    val selectedTab: AppTab = AppTab.HOME
)
