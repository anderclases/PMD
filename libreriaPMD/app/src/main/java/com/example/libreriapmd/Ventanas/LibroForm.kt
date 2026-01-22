package com.example.libreriapmd.Ventanas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.libreria.ui.components.DefaultColumn
import com.example.libreria.ui.components.DefaultOutlinedTextField

enum class TipoLibro {
    FISICO,
    ELECTRONICO
}

@Composable
fun LibroForm(navController: NavController, modifier: Modifier, viewModel: MainViewModel) {
    DefaultColumn(modifier = modifier)
    {
        DefaultOutlinedTextField(
            texto = viewModel.titulo,
            onTextoChange = { nuevoTexto -> viewModel.onTituloChanged(nuevoTexto) },
            placeholder = "Título"
        )

        DefaultOutlinedTextField(
            texto = viewModel.autor,
            onTextoChange = { nuevoTexto -> viewModel.onAutorChanged(nuevoTexto) },
            placeholder = "Autor"
        )

        SelectorTipoLibro(
            tipoSeleccionado = viewModel.tipoLibro,
            onTipoSeleccionado = viewModel::seleccionarTipo
        )

    }
}

@Composable
fun SelectorTipoLibro(
    tipoSeleccionado: TipoLibro,
    onTipoSeleccionado: (TipoLibro) -> Unit
) {
    Column {
        Text(text = "Tipo de libro")

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = tipoSeleccionado == TipoLibro.FISICO,
                onClick = { onTipoSeleccionado(TipoLibro.FISICO) }
            )
            Text(text = "Libro físico")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = tipoSeleccionado == TipoLibro.ELECTRONICO,
                onClick = { onTipoSeleccionado(TipoLibro.ELECTRONICO) }
            )
            Text(text = "Libro electrónico")
        }
    }
}