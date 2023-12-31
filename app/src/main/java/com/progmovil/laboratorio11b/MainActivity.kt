package com.progmovil.laboratorio11b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.progmovil.laboratorio11b.ui.theme.Laboratorio11bTheme
import com.progmovil.laboratorio11b.view.PokemonScreen
import com.progmovil.laboratorio11b.viewmodel.PokemonViewModel

class MainActivity : ComponentActivity() {
    private val viewModel : PokemonViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokemonScreen(viewModel)
        }
    }
}

//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Laboratorio11bTheme {
//        Greeting("Android")
//    }
//}