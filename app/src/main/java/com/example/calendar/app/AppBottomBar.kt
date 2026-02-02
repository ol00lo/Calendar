package com.example.calendar.app

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun AppBottomBar(
    currentTab: AppTab,
    onTabSelected: (AppTab) -> Unit
) {
    NavigationBar {
        AppTab.entries.forEach { tab ->
            NavigationBarItem(
                selected = tab == currentTab,
                onClick = { onTabSelected(tab) },
                label = { Text(tab.title) },
                icon = {}
            )
        }
    }
}