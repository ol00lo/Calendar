package com.example.calendar.domain.repository

import com.example.calendar.domain.model.TrackItem
import kotlinx.coroutines.flow.StateFlow

interface TrackItemRepository {

    val items: StateFlow<List<TrackItem>>

    suspend fun addItem(item: TrackItem)

    suspend fun removeItem(id: Long)
}
