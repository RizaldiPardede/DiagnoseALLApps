package com.example.diagnosaallapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diagnosaallapps.ui.theme.DiagnosaALLappsTheme
class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiagnosaALLappsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Banner(userName = "Rizaldi", date = "Selasa, 13 Juni 2023")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun Banner(
    userName: String,
    date: String,
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier
        .fillMaxWidth()
        .height(103.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceBetween) {
        Column(
        ) {
            Text(
                text = userName,
                fontSize = 20.sp,
                modifier = modifier.padding(start = 23.dp),
                style = MaterialTheme.typography.h1.copy(
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = date,
                fontSize = 15.sp,
                modifier = modifier.padding(start = 23.dp),
                style = MaterialTheme.typography.subtitle1.copy(
                    fontWeight = FontWeight.Medium
                )
            )
        }
        Image(
            painter = painterResource(R.drawable.userprofile),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .padding(end = 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DiagnosaALLappsTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Banner(userName = "Rizaldi", date = "Selasa, 13 Juni 2023")
        }
    }
}