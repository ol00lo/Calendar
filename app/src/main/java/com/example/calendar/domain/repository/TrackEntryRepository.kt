package com.example.calendar.domain.repository

import com.example.calendar.domain.model.TrackEntry
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

interface TrackEntryRepository {

    fun getAllEntries(): Flow<List<TrackEntry>>

    fun getEntriesByDate(date: LocalDate): Flow<List<TrackEntry>>

    suspend fun addEntry(entry: TrackEntry)

    suspend fun deleteEntry(entry: TrackEntry)

    suspend fun isItemTrackedOnDate(
        itemId: Long,
        date: LocalDate
    ): Boolean
}
