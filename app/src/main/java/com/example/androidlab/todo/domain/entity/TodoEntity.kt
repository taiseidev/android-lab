package com.example.androidlab.todo.domain.entity

import androidx.compose.ui.graphics.Color

data class TodoEntity(
    val date: String,
    val title: String,
    val priority: Priority
) {
    companion object {
        fun mock() = TodoEntity(
            date = "2023/01/01",
            title = "Task",
            priority = Priority.HIGH
        )
    }
}

enum class Priority(
    val color: Color,
    val label: String
) {
    HIGH(Color(0xFFFF6F61), "High"),
    MEDIUM(Color(0xFFFFD700), "Medium"),
    LOW(
        Color(0xFF3CB371), "Low"
    )
}