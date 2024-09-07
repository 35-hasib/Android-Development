package com.example.test_001

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(modfier : Modifier = Modifier,authViewModel: AuthView){
    var navContoller = rememberNavController()
    NavHost(navController = navContoller, startDestination = "getstarted", builder = {
        composable("getstarted"){
            GetStarted(navContoller,authViewModel)
        }
        composable("login"){
            Login(navContoller,authViewModel)
        }
        composable("signup"){
            SignUp(navContoller,authViewModel)
        }
    })
}