package com.example.calendar.ui.main

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun RecentItemsBlock(
    items: List<TrackItem>,
    onAddItemClick: () -> Unit
) {
    Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {

        IconButton(onClick = onAddItemClick) {
            Text("+")
        }

        items.forEach { item ->
            Text(
                text = "${item.emoji} ${item.name}",
                modifier = androidx.compose.ui.Modifier.padding(horizontal = 8.dp)
            )
        }

    }
}