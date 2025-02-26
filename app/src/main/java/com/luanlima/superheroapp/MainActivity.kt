package com.luanlima.superheroapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.luanlima.superheroapp.ui.theme.SuperHeroAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperHeroAppTheme {
                SuperHeroApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun SuperHeroApp(modifier: Modifier = Modifier) {
        Scaffold(
            modifier = modifier
        ) {
            innerPadding -> Box(modifier = modifier.padding(innerPadding))
        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SuperHeroAppTheme {
        SuperHeroApp(modifier = Modifier.fillMaxSize())
    }
}