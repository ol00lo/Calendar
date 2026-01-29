package com.example.calendar.ui.main


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun MainScreen(
    state: MainUiState,
    onMenuClick: () -> Unit,
    onAccountClick: () -> Unit,
    onAddItemCLick: () -> Unit,
    onTabSelected: (MainTab) -> Unit
) {
    Scaffold(
        topBar = {
            MainTopBar(
                onMenuClick = onMenuClick,
                onAccountClick = onAccountClick
            )
        },
        bottomBar = {
            MainBottomBar(
                selectedTab = state.selectedTab,
                onTabSelected = onTabSelected
            )
        }
    ) { padding ->
        MainContent(
            modifier = Modifier.padding(padding),
            state = state,
            onAddItemClick = onAddItemCLick
        )
    }
}