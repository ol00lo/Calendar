package com.example.calendar.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Spacer
import com.example.calendar.home.components.RecentItemsBlock
import com.example.calendar.home.components.SelectedItemsBlock

@Composable
fun HomeContent(
    modifier: Modifier,
    state: HomeUiState,
    onAddItemClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = state.selectedDate.toString(),
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(Modifier.height(16.dp))

        RecentItemsBlock(
            items = state.recentItems,
            onAddItemClick = onAddItemClick
        )

        Spacer(Modifier.height(16.dp))

        SelectedItemsBlock(
            items = state.selectedItemsToday
        )
    }

}