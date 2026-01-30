package com.example.calendar.home.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.calendar.domain.model.TrackItem

@Composable
fun RecentItemsBlock(
    items: List<TrackItem>,
    onAddItemClick: () -> Unit
) {
    Row(verticalAlignment = Alignment.CenterVertically) {

        IconButton(onClick = onAddItemClick) {
            Text("+")
        }

        items.forEach { item ->
            Text(
                text = "${item.emoji} ${item.name}",
                modifier = Modifier.padding(horizontal = 8.dp)
            )
        }

    }
}