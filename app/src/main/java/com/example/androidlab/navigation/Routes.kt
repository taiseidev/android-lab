package com.example.androidlab.navigation

sealed class Routes(
    val route: String,
    val title: String,
) {
    data object TodoList : Routes(
        route = "todo-list",
        title = "TodoList",
    )

}