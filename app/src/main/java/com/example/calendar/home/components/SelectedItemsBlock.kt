package com.example.calendar.home.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.calendar.domain.model.TrackItem

@Composable
fun SelectedItemsBlock(items: List<TrackItem>) {
    if (items.isEmpty()) {
        Text("Nothing checked")
    } else {
        items.forEach {
            Text("${it.emoji} ${it.name}")
        }
    }
}