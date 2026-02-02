package com.example.libreria.ui.ventanas

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.Hyphens
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.libreria.Libro
import com.example.libreria.ui.components.DefaultColumn
import com.example.libreria.ui.shared.LibroViewModel
import com.example.libreria_pmd.MyLog


@Composable
fun VentanaVer(
    navController: NavController,
    modifier: Modifier = Modifier,
    viewModel: LibroViewModel
) {
    val libros = viewModel.listaLibros

    val uiScope = rememberCoroutineScope()
    val context = LocalContext.current

    fun crearLibro() {
        MyLog.d("VentanaVer.crearLibro")
        navController.navigate("LibroForm")
    }

    DefaultColumn(modifier = modifier) {
        Text("VentanaVer")

        Button({ viewModel.insertarDatosPrueba() }) { Text("Insertar datos de prueba") }
        Button(onClick = {
            crearLibro()
        }) {
            Text("Añadir libro")
        }


        // COLUMNA DE VISUALICACIÓN DE DATOS
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(libros) { libro ->
                Text(text = libro.toString(), modifier = Modifier.padding(4.dp))
                Divider()
            }
        }
    }
}