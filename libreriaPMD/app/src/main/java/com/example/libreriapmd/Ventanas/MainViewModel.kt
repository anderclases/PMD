package com.example.libreriapmd.Ventanas

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class MainViewModel {
    var errorMensaje by mutableStateOf<String?>(null)
        private set

    //Titulo del libro
    var titulo by mutableStateOf("")
        private set
    fun onTituloChanged(nuevoTexto: String) {
        titulo = nuevoTexto
        if (errorMensaje != null) errorMensaje = null
    }

    // Nombre del autor
    var autor by mutableStateOf("")
        private set
    fun onAutorChanged(nuevoTexto: String) {
        autor = nuevoTexto
        if (errorMensaje != null) errorMensaje = null
    }

    //año de la publicacion
    var publicacion by mutableStateOf("")
        private set
    fun onPublicacionChanged(nuevoTexto: String) {
        publicacion = nuevoTexto
        if (errorMensaje != null) errorMensaje = null
    }

    // se han planteado dos formas de elegir el tipo de libro
    // 1 usando un selector
    var tipoLibro by mutableStateOf(TipoLibro.FISICO)
        private set

    fun seleccionarTipo(tipo: TipoLibro) {
        tipoLibro = tipo
    }

    // 2 como solo hay dos opciones, con un boolean para libroElectronico


}