package com.example.androidlab

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidlab.navigation.Routes
import com.example.androidlab.navigation.rememberAppNavController
import com.example.androidlab.theme.AndroidLabTheme
import com.example.androidlab.todo.ui.TodoListScreen

@SuppressLint("RememberReturnType")
@Composable
fun AndroidLabApp() {
    AndroidLabTheme {
        val navController = rememberNavController()
        val appNavController = rememberAppNavController(navController)

        NavHost(
            navController = appNavController.navController,
            startDestination = Routes.TodoList.route
        ) {
            composable(Routes.TodoList.route) {
                TodoListScreen()
            }

        }
    }
}