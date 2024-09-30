package com.example.admintasks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
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
    GreetingImage()
}

@Composable
fun GreetingImage() {
    val image = painterResource(R.drawable.ic_task_completed)

    Image (
        painter = image,
        contentDescription = null
    )
}

@Preview(showBackground = true)
@Composable
fun AdminTasksPreview() {
    AdminTasksTheme {
        AdminTasks()
    }
}