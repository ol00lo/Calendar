package com.example.calendar.home

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun HomeScreen(
    padding: PaddingValues,
    viewModel: HomeViewModel = viewModel()
) {
    HomeContent(
        modifier = Modifier.padding(padding),
        state = viewModel.uiState.value,
        onAddItemClick = viewModel::onAddItemClick
    )
}
