package com.example.calendar.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.calendar.domain.model.TrackItem
import com.example.calendar.domain.repository.TrackItemRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: TrackItemRepository
) : ViewModel() {

    val trackedItems = repository.items

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState

    fun openDialog() {
        _uiState.update { it.copy(isDialogOpen = true) }
    }

    fun closeDialog() {
        _uiState.update { it.copy(isDialogOpen = false) }
    }

    fun onAddItem(name: String, emoji: String) {
        viewModelScope.launch {
            repository.addItem(
                TrackItem(
                    id = 0L,
                    name = name,
                    emoji = emoji
                )
            )
            closeDialog()
        }
    }

    fun onMenuClick() {
        TODO()
    }

    fun onAccountClick() {
        TODO()
    }
}
