package com.example.calendar.home

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calendar.home.components.AddItemDialog


@Composable
fun HomeScreen(
    padding: PaddingValues,
    viewModel: HomeViewModel = viewModel()
) {
    val trackedItems = viewModel.trackedItems.collectAsState()
    val uiState = viewModel.uiState.collectAsState().value

    HomeContent(
        modifier = Modifier.padding(padding),
        state = uiState,
        trackedItems = trackedItems.value,
        onAddItemClick = { viewModel.openDialog() }
    )

    if (uiState.isDialogOpen) {
        AddItemDialog(
            onDismiss = { viewModel.closeDialog() },
            onConfirm = { name, emoji -> viewModel.onAddItem(name, emoji) }
        )
    }
}
