package com.example.test_001

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUp(){

    var fname by remember {
        mutableStateOf("")
    }
    var lname by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var uname by remember {
        mutableStateOf("")
    }
    var pass by remember {
        mutableStateOf("")
    }
    var repass by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Sign Up",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Create your account"
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = fname, onValueChange = {
            fname = it
        }, label = {
            Text(text = "First Name")
        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = lname, onValueChange = {
            lname = it
        }, label = {
            Text(text = "Last Name")
        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Email Address")
        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = uname, onValueChange = {
            uname = it
        }, label = {
            Text(text = "Username")
        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = pass, onValueChange = {
            pass = it
        }, label = {
            Text(text = "Password")
        },visualTransformation = PasswordVisualTransformation())
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = repass, onValueChange = {
            repass = it
        }, label = {
            Text(text = "Confirm Password")
        },visualTransformation = PasswordVisualTransformation())
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Sign Up")
        }
        Spacer(modifier = Modifier.height(40.dp))

        Row(

        ) {
            Text(text = "Already have an account?  ")

            Text(
                text = "Login",
                color = Color.Blue,
                modifier = Modifier.clickable {

                }
            )
        }

    }
}