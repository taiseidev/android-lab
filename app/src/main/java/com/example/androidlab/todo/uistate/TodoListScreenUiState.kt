package com.example.androidlab.todo.uistate

sealed class TodoListUiState() {
    data object Empty : TodoListUiState()
    data object Loading : TodoListUiState()
    data object Success : TodoListUiState()
}