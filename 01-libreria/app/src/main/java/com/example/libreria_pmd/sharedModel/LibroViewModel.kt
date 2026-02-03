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
        titulo = nuevoTexto
        if (errorMensaje != null) errorMensaje = null // Limpiar error al escribir
    }

    var autor by mutableStateOf("")
        private set

    fun onAutorChanged(nuevoTexto: String) {
        autor = nuevoTexto
        if (errorMensaje != null) errorMensaje = null
    }

    var publicacion by mutableStateOf("")
        private set

    fun onPublicacionChanged(nuevoTexto: String) {
        publicacion = nuevoTexto
        if (errorMensaje != null) errorMensaje = null
    }

    var precio by mutableStateOf("")
        private set

    fun onPrecioChanged(nuevoTexto: String) {
        precio = nuevoTexto
        if (errorMensaje != null) errorMensaje = null // Limpiar error al escribir
    }

    private fun limpiarFormulario() {
        titulo = ""
        autor = ""
        publicacion = ""
        errorMensaje = null
    }

    fun insertarDatosPrueba() {

        val librosPrueba = listOf<Libro>(
            Libro("Rebelión en la Granja",1945, 15),
            Libro("Orgullo y Prejuicio",1813, 17)
        )
        librosPrueba.forEach {
            MyLog.d(it.toString())
            MyLog.d("Es caro? ${it.esCaro().aRespuesta()}")
            listaLibros.add(it)
            MyLog.d("prueba incluida: "+ it.toString())
        }
    }

    // Por ser flow cambia la forma de acceder a la lista
    suspend fun sumarPrecios():Int {
        var precioTotal = 0
        listaLibros.forEach {
            precioTotal += it.precio
        }
        return precioTotal
    }

    fun guardarLibro(onSuccess: () -> Unit) {
        // validaciones y errores
        var inPublicacion = 0
        var inPrecio = 0
        try {
            inPublicacion = publicacion.toInt()
        } catch (e : Exception) {
            errorMensaje = "La fecha no es un número cómo se espera"
            return
        }
        try {
            inPrecio = precio.toInt()
        } catch (e : Exception) {
            errorMensaje = "El precio no es un número cómo se espera"
            return
        }
        // creamos la instacia
        var libro:Libro = Libro(titulo,inPublicacion, inPrecio)
        listaLibros.add(libro)
        onSuccess()
    }
}


fun Boolean.aRespuesta():String {
    if(this) return "SI"
    else return "NO"
}