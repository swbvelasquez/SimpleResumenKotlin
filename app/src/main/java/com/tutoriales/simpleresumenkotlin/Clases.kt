package com.tutoriales.simpleresumenkotlin

import android.util.Log

class Clases {

    data class Fruta(
        val id:Int, //no se puede modificar
        var nombre:String, //se puede modificar
        var precio:Float,
        var cantidad:Int
    )

    fun llamarFruta(){
        val fruta:Fruta = Fruta(1,"Mango",120.0f,100)
        val copiaFruta:Fruta = fruta.copy(id = 2,nombre = "Pera")
        val listaFrutas:MutableList<Fruta> = mutableListOf()

        Log.d("Clases","Fruta: ${fruta.nombre}")
        Log.d("Clases","Id Fruta 2: ${copiaFruta.id}")
        Log.d("Clases","Fruta 2: ${copiaFruta.component2()}") // nombre

        listaFrutas.add(fruta)
        listaFrutas.add(copiaFruta)
    }
}