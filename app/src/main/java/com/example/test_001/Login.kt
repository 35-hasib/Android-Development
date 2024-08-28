package com.example.test_001

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Login() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome To BudgetTracker",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Login to your account"
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = "", onValueChange = {},label = {
            Text(text = "Email address")
        })
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = "", onValueChange = {},label = {
            Text(text = "Password")
        })
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(20.dp))


        Text(text = "Forgot Password?", modifier = Modifier.clickable {

        })
    }
}