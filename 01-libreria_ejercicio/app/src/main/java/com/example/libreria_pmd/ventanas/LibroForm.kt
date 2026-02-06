package com.example.libreria.ui.ventanas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.libreria.ui.components.DefaultColumn
import com.example.libreria.ui.components.DefaultOutlinedTextField
import com.example.libreria.ui.shared.LibroViewModel
import com.example.libreria.ui.shared.RadioTipo
import com.example.libreria_pmd.MyLog
import kotlinx.coroutines.launch


@Composable
fun LibroForm(modifier: Modifier, viewModel: LibroViewModel) {

    val uiScope = rememberCoroutineScope()


    DefaultColumn {
        Text("LibroForm: ")

        DefaultOutlinedTextField(
            texto = viewModel.titulo,
            onTextoChange = {
                //TODO
                            },
            placeholder = "Título"
        )

        Row(verticalAlignment = Alignment.CenterVertically) {
            val tipoLibro by viewModel.radioTipo
            RadioButton(
                selected = tipoLibro == RadioTipo.FISICO,
                onClick = {
                    viewModel.cambiarTipoLibro(RadioTipo.FISICO)
                    MyLog.d("LibroForm-tipoLibro:${tipoLibro}")
                }
            )
            Text("Fisico")

            Spacer(modifier = Modifier.width(16.dp))

            Spacer(modifier = Modifier.width(16.dp))

            RadioButton(
                selected = tipoLibro == RadioTipo.DIGITAL,
                onClick = {
                    viewModel.cambiarTipoLibro(RadioTipo.DIGITAL)
                    MyLog.d("LibroForm-tipoLibro:${tipoLibro}")
                }
            )
            Text("Digital")
        } // fin RadioButton

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                //TODO navegar
            }) { Text("Cancelar") }
            Button(onClick = {
                uiScope.launch {
                    viewModel.guardarLibro() {
                        //TODO ir atras
                    }
                }
            }) { Text("Aceptar") }
        }
        viewModel.errorMensaje?.let { Text(it,color = Color.Red) }
    }
}
