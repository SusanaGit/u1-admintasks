package com.example.admintasks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.admintasks.ui.theme.AdminTasksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdminTasksTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AdminTasks()
                }
            }
        }
    }
}

@Composable
fun AdminTasks() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GreetingImage()
        GreetingText()
    }
}

@Composable
fun GreetingImage() {
    val image = painterResource(R.drawable.ic_task_completed)
    Image (
        painter = image,
        contentDescription = null
    )
}

@Composable
fun GreetingText() {
    Text(
        text = "All tasks completed",
        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
        fontWeight = FontWeight.Bold
    )
    Text(
        text = "Nice work!",
        fontSize = 16.sp
    )
}

@Preview(showBackground = true)
@Composable
fun AdminTasksPreview() {
    AdminTasksTheme {
        AdminTasks()
    }
}