package com.example.calendar.home

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun HomeScreen(
    state: HomeUiState,
    padding: PaddingValues,
    onAddItemClick: () -> Unit
) {
    HomeContent(
        modifier = Modifier.padding(padding),
        state = state,
        onAddItemClick = onAddItemClick
    )
}