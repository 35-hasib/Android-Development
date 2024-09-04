package com.example.test_001

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Home() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Budget Tracker", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Gray
                ),

            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* Add new transaction */ }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            // Budget Summary
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Color.LightGray
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                    ) {
                        Text(text = " Total Balance",fontSize = 30.sp,
                            fontWeight = FontWeight.Bold)
                        Text(text = "  $50000",fontSize = 20.sp)
                    }
                    Text(
                        text = "   ...   ",fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.clickable {

                        }
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                    ) {
                        Text(text = " Income",fontSize = 20.sp,
                            fontWeight = FontWeight.Bold)
                    }
                    Text(text = "Expense ",fontSize = 20.sp,
                        fontWeight = FontWeight.Bold)
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(

                    ) {
                        Text(text = "  $500",fontSize = 15.sp)
                    }
                    Text(text = "$100  ",fontSize = 15.sp)
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            // Recent Transactions
            Row() {
                Text("Recent Transactions", style = MaterialTheme.typography.titleLarge)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {
                    Text("See all",
                        style = MaterialTheme.typography.titleSmall,
                        modifier = Modifier.clickable {

                        }
                    )
                }

            }

            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(5) { index ->
                    TransactionListItem(
                        title = "Transaction $index",
                        category = "Category",
                        amount = "-$50"
                    )
                    Divider()
                }
            }
        }
    }
}
@Composable
fun TransactionListItem(title: String, category: String, amount: String){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(

        ) {
            Text(title, style = MaterialTheme.typography.bodyLarge)
            Text(category, style = MaterialTheme.typography.bodySmall, color = Color.Gray)
        }
        Text(amount, style = MaterialTheme.typography.bodyLarge)
    }
}



