package com.example.calendar.ui.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

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