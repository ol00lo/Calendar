package com.example.calendar.statistics

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.calendar.domain.model.TrackItem

@Composable
fun StatisticsContent(
    trackedItems: List<TrackItem>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Statistics", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(16.dp))

        if (trackedItems.isEmpty()) {
            Text("No tracked items yet", style = MaterialTheme.typography.bodyMedium)
        } else {
            LazyColumn {
                items(trackedItems) { item ->
                    Text("${item.emoji} ${item.name}", style = MaterialTheme.typography.bodyLarge)
                }
            }
        }
    }
}