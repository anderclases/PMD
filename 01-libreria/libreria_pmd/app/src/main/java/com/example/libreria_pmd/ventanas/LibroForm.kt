package com.example.libreria.ui.ventanas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.libreria.ui.components.DefaultColumn
import com.example.libreria.ui.components.DefaultOutlinedTextField
import com.example.libreria.ui.shared.LibroViewModel
import kotlinx.coroutines.launch


@Composable
fun LibroForm(
    navController: NavController, modifier: Modifier, viewModel: LibroViewModel) {


    val uiScope = rememberCoroutineScope()


    DefaultColumn {
        Text("LibroForm: ")

        DefaultOutlinedTextField(
            texto = viewModel.titulo,
            onTextoChange = { nuevoTexto -> viewModel.onTituloChanged(nuevoTexto) },
            placeholder = "Título"
        )

        DefaultOutlinedTextField(
            texto = viewModel.publicacion,
            onTextoChange = { nuevoTexto -> viewModel.onPublicacionChanged(nuevoTexto) },
            placeholder = "Año de publicacion"
        )

        DefaultOutlinedTextField(
            texto = viewModel.precio,
            onTextoChange = { nuevoTexto -> viewModel.onPrecioChanged(nuevoTexto) },
            placeholder = "Precio"
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                navController.navigate("VentanaVer")
            }) { Text("Cancelar") }
            Button(onClick = {
                uiScope.launch {
                    viewModel.guardarLibro() {navController.popBackStack()}
                }
            }) { Text("Aceptar") }
        }
        viewModel.errorMensaje?.let { Text(it,color = Color.Red) }
    }
}
