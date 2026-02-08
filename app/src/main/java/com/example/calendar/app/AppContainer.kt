package com.example.calendar.app

import com.example.calendar.domain.repository.InMemoryTrackItemRepository
import com.example.calendar.domain.repository.TrackItemRepository

class AppContainer {
    val trackItemRepository: TrackItemRepository =
        InMemoryTrackItemRepository()
}
