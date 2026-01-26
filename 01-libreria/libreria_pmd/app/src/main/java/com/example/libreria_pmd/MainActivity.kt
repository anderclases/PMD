package com.example.libreria_pmd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.libreria.ui.shared.LibroViewModel
import com.example.libreria.ui.ventanas.LibroForm
import com.example.libreria.ui.ventanas.VentanaVer
import com.example.libreria_pmd.ui.theme.Libreria_pmdTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Libreria_pmdTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    gestorVentanas(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun gestorVentanas(modifier: Modifier) {
    val context = LocalContext.current


    val libroViewModel: LibroViewModel = viewModel()

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "VentanaVer"
    ) {
        composable("LibroForm")  { LibroForm(navController, modifier, libroViewModel) }
        composable("VentanaVer") { VentanaVer(navController, modifier, libroViewModel) }
    }
}