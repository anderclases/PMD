package com.example.libreriapmd.clases

class LibroDigital(
    titulo: String,
    autor: String,
    publicadoEn: Int,
    reservado: Boolean,
    var tamanoArchivo: Int) : Libro(titulo, autor, publicadoEn, reservado) {


    override fun toString(): String {
        return super.toString() +
                ", tamanoArchivo: " + tamanoArchivo;
    }
}