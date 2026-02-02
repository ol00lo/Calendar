package com.example.calendar.app

import android.R
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    title: String,
    onMenuClick: () -> Unit,
    onAccountClick: () -> Unit
) {
    TopAppBar(
        title = { Text(title) },
        navigationIcon = {
            IconButton(onClick = onMenuClick) {
                Icon(
                    painter = painterResource(R.drawable.ic_menu_sort_by_size),
                    contentDescription = "Menu"
                )
            }
        },
        actions = {
            IconButton(onClick = onAccountClick) {
                Icon(
                    painter = painterResource(R.drawable.ic_menu_myplaces),
                    contentDescription = "Account"
                )
            }
        }
    )
}
