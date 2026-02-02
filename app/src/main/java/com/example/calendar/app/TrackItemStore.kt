package com.example.calendar.app

import com.example.calendar.domain.model.TrackItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


object TrackItemStore {
    private val _items = MutableStateFlow<List<TrackItem>>(
        listOf(
            TrackItem("Run", "🏃‍♀️"),
            TrackItem("Smoke", "🚬"),
            TrackItem("Yoga", "🧘‍♀️")
        )
    )

    val items: StateFlow<List<TrackItem>> = _items

    fun addItem(item: TrackItem) {
        _items.value += item
    }
}