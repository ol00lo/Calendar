package com.example.calendar.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.calendar.app.TrackItemStore

import com.example.calendar.domain.model.TrackItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

class HomeViewModel : ViewModel() {

    val trackedItems =
        TrackItemStore.items.stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState

    fun openDialog() {
        _uiState.update { it.copy(isDialogOpen = true) }
    }

    fun closeDialog() {
        _uiState.update { it.copy(isDialogOpen = false) }
    }

    fun onAddItem(name: String, emoji: String) {
        TrackItemStore.addItem(TrackItem(name, emoji))
        closeDialog()
    }

    fun onMenuClick() {
        // TODO
    }

    fun onAccountClick() {
        // TODO
    }
}
