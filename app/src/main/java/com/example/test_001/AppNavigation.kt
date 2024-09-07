package com.example.test_001

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(){
    var navContoller = rememberNavController()
    NavHost(navController = navContoller, startDestination = "getstarted", builder = {
        composable("getstarted"){
            GetStarted(navContoller)
        }
        composable("login"){
            Login(navContoller)
        }
        composable("signup"){
            SignUp(navContoller)
        }
    })
}