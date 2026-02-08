package com.example.calendar.statistics

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calendar.domain.repository.TrackItemRepository


@Composable
fun StatisticsScreen(
    padding: PaddingValues,
    repository: TrackItemRepository
) {
    val viewModel: StatisticsViewModel = viewModel(factory = StatisticsViewModelFactory(repository))
    val trackedItems = viewModel.trackedItems.collectAsState()

    StatisticsContent(
        trackedItems = trackedItems.value,
        modifier = Modifier.padding(padding)
    )
}