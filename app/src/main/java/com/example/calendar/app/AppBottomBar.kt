package com.example.calendar.app

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun AppBottomBar(
    selectedTab: AppTab,
    onTabSelected: (AppTab) -> Unit
) {
    NavigationBar {
        NavigationBarItem(
            selected = selectedTab == AppTab.HOME,
            onClick = { onTabSelected(AppTab.HOME) },
            label = { Text("Main") },
            icon = {}
        )
        NavigationBarItem(
            selected = selectedTab == AppTab.STATS,
            onClick = { onTabSelected(AppTab.STATS) },
            label = { Text("Statistic") },
            icon = {}
        )
        NavigationBarItem(
            selected = selectedTab == AppTab.OTHER,
            onClick = { onTabSelected(AppTab.OTHER) },
            label = { Text("Other") },
            icon = {}
        )
    }
}