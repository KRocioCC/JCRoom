package com.karenkotlin.jcroom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.karenkotlin.jcroom.ui.theme.JCRoomTheme
import com.karenkotlin.jcroom.viewmodel.InsectViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JCRoomTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    val viewModel: InsectViewModel = viewModel()
    NavHost(
        navController = navController,
        startDestination = "list"
    ){
        composable("list"){
            InsectListScreen(
                viewModel = viewModel,
                onNew = {
                    navController.navigate("form")
                }
            )
        }
        composable("form"){
            InsectFormScreen(
                viewModel = viewModel,
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}