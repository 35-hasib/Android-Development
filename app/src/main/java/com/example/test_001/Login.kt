package com.example.test_001

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Login() {

    Button(onClick = { /*TODO*/ }) {
        Text(
            text = "Login",
            color = Color.Red,

        )
    }
}