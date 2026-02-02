package com.example.libreria

interface Producto {
    fun esCaro(): Boolean
}

open class Libro(
    var titulo: String = "",
    var publicacion: Int = 0,
    var precio: Int = 0
): Producto {

    override fun esCaro():Boolean {
        var resultado = false
        if(this.precio>25) {
            resultado = true
        }
        return resultado
    }

    override fun toString():String {
        return "${this::class.simpleName} - titulo:${this.titulo},publicacion:${this.publicacion},precio:${this.precio}"
    }
}

class LibroDigital(
    titulo: String = "",
    publicacion: Int = 0,
    precio: Int = 0,
    var sizeArchivoMB: Int = 0,
    var formato: String = "PDF"
) : Libro(titulo, publicacion, precio) {

    override fun toString(): String {
        return "${super.toString()}, tamañoArchivoMB:$sizeArchivoMB, formato:$formato"
    }

}