package com.example.calendar.ui.main

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun MainBottomBar(
    selectedTab: MainTab,
    onTabSelected: (MainTab) -> Unit
) {
    NavigationBar {
        NavigationBarItem(
            selected = selectedTab == MainTab.HOME,
            onClick = { onTabSelected(MainTab.HOME) },
            label = { Text("Main") },
            icon = {}
        )
        NavigationBarItem(
            selected = selectedTab == MainTab.STATS,
            onClick = { onTabSelected(MainTab.STATS) },
            label = { Text("Statistic") },
            icon = {}
        )
        NavigationBarItem(
            selected = selectedTab == MainTab.OTHER,
            onClick = { onTabSelected(MainTab.OTHER) },
            label = { Text("Other") },
            icon = {}
        )
    }
}