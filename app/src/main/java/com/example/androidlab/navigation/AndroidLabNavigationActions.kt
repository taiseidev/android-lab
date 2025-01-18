package com.example.androidlab.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun rememberAppNavController(navController: NavHostController = rememberNavController()): AppNavController =
    remember(navController) {
        AppNavController(navController)
    }

class AppNavController(
    val navController: NavHostController
) {
// TODO: 画面遷移のロジックを記述
}
