package com.example.calendar.ui.main

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State


class MainViewModel : ViewModel() {

    private val _counter = mutableStateOf(0)
    val counter: State<Int> = _counter

    fun onButtonClick() {
        _counter.value++
    }

}