package com.example.calendar.statistics

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun StatisticsScreen(
    padding: PaddingValues,
    viewModel: StatisticsViewModel = viewModel()
) {
    val trackedItems = viewModel.trackedItems.collectAsState()

    StatisticsContent(
        trackedItems = trackedItems.value,
        modifier = Modifier.padding(padding)
    )
}