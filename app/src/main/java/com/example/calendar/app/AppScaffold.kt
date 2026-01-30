package com.example.calendar.app

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun AppScaffold(
    currentTab: AppTab,
    onTabSelected: (AppTab) -> Unit,
    onMenuClick: () -> Unit,
    onAccountClick: () -> Unit,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        topBar = {
            AppTopBar(
                onMenuClick = onMenuClick,
                onAccountClick = onAccountClick
            )
        },
        bottomBar = {
            AppBottomBar(
                selectedTab = currentTab,
                onTabSelected = onTabSelected
            )
        }
    ) { padding ->
        content(padding)
    }
}
