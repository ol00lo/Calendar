package com.example.calendar.domain.repository

import com.example.calendar.domain.model.TrackEntry
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map
import java.time.LocalDate

class InMemoryTrackEntryRepository : TrackEntryRepository {

    private val _entries = MutableStateFlow<List<TrackEntry>>(emptyList())
    private var nextId = 1L

    override fun getAllEntries(): Flow<List<TrackEntry>> =
        _entries

    override fun getEntriesByDate(date: LocalDate): Flow<List<TrackEntry>> =
        _entries.map { list ->
            list.filter { it.date == date }
        }

    override suspend fun addEntry(entry: TrackEntry) {
        val alreadyExists = _entries.value.any {
            it.itemId == entry.itemId && it.date == entry.date
        }

        if (alreadyExists) return

        val entryWithId = entry.copy(id = nextId++)
        _entries.value = _entries.value + entryWithId
    }

    override suspend fun deleteEntry(entry: TrackEntry) {
        _entries.value = _entries.value.filterNot {
            it.itemId == entry.itemId && it.date == entry.date
        }
    }

    override suspend fun isItemTrackedOnDate(
        itemId: Long,
        date: LocalDate
    ): Boolean {
        return _entries.value.any {
            it.itemId == itemId && it.date == date
        }
    }
}
