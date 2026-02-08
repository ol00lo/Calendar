package com.example.calendar.home

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calendar.domain.repository.TrackItemRepository
import com.example.calendar.home.components.AddItemDialog


@Composable
fun HomeScreen(
    padding: PaddingValues,
    repository: TrackItemRepository
) {
    val viewModel: HomeViewModel = viewModel(factory = HomeViewModelFactory(repository))
    val trackedItems by viewModel.trackedItems.collectAsState()
    val uiState by viewModel.uiState.collectAsState()


    HomeContent(
        modifier = Modifier.padding(padding),
        state = uiState,
        trackedItems = trackedItems,
        onAddItemClick = { viewModel.openDialog() }
    )

    if (uiState.isDialogOpen) {
        AddItemDialog(
            onDismiss = { viewModel.closeDialog() },
            onConfirm = { name, emoji -> viewModel.onAddItem(name, emoji) }
        )
    }
}
