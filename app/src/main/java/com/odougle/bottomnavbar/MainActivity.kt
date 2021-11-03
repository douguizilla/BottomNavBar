package com.odougle.bottomnavbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.odougle.bottomnavbar.ui.theme.BottomNavBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavBarTheme {
                MainScreen()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BottomNavBarTheme {
        MainScreen()
    }
}

//fonte youtube.com/watch?v=gg-KBGH9T8s&list=WL&index=60&t=32s