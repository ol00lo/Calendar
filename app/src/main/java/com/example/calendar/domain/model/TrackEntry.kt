package com.example.calendar.domain.model

import java.time.LocalDate

data class TrackEntry(
    val id: Long,
    val itemId: Long,
    val date: LocalDate
)
