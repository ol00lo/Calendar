package com.example.calendar.domain.repository

import com.example.calendar.domain.model.TrackItem
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class InMemoryTrackItemRepository : TrackItemRepository {

    private val _items = MutableStateFlow<List<TrackItem>>(emptyList())
    override val items: StateFlow<List<TrackItem>> = _items

    private var nextId = 1L

    override suspend fun addItem(item: TrackItem) {
        val itemWithId = item.copy(id = nextId++)
        _items.update { it + itemWithId }
    }

    override suspend fun removeItem(id: Long) {
        _items.update { list -> list.filterNot { it.id == id } }
    }
}