package com.example.libreriapmd.clases

// Ser open le permite ser madre de otra clase
open class Libro(
    var titulo: String,
    var autor: String,
    var publicadoEn: Int,
    var reservado: Boolean): LibroOperaciones {

    // es el equivalente a toString pero con menos info
    override fun toString(): String {
        return ("titulo=${titulo}+" +
                ", autor=${autor}" +
        ", publicadoEn=$publicadoEn." +
        ", reservado=$reservado."
                )
    }

    override fun infoResumen(): String {
        return ("titulo=${titulo}+" +
                ", autor=${autor}"
                )
    }

    override fun reservarLibro() {
        reservado = true
    }
}