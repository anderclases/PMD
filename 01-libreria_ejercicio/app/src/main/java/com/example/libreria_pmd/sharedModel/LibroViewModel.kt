package com.example.libreria.ui.shared

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.libreria.Libro
import com.example.libreria_pmd.MyLog

enum class RadioTipo {
    FISICO,
    DIGITAL,
}

class LibroViewModel() : ViewModel() {

    // para radiobutton
    private val _radioTipo = mutableStateOf(RadioTipo.FISICO)
    val radioTipo: State<RadioTipo> = _radioTipo
    fun cambiarTipoLibro(nuevo: RadioTipo) {
        _radioTipo.value = nuevo
        MyLog.d("Radio update: ${nuevo.toString()}")
    }
    // FIN radiobutton

    val listaLibros = mutableStateListOf<Libro>()


    // Estado para manejar errores visuales
    var errorMensaje by mutableStateOf<String?>(null)
        private set


    var titulo by mutableStateOf("")
        private set

    fun onTituloChanged(nuevoTexto: String) {
        //TODO
    }

    private fun limpiarFormulario() {
        //TODO
    }

    fun insertarDatosPrueba() {
        //TODO
    }

    fun guardarLibro(onSuccess: () -> Unit) {
        // validaciones y errores
        //TODO
    }
}

//TODO aRespuesta