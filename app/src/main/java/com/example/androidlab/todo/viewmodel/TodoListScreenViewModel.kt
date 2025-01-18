package com.example.androidlab.todo.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidlab.todo.uistate.TodoListUiState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TodoListScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<TodoListUiState>(TodoListUiState.Loading)
    val uiState: StateFlow<TodoListUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            delay(5000)
            _uiState.value = TodoListUiState.Success
        }

    }
}