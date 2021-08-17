package com.tutoriales.simpleresumenkotlin

import android.util.Log

class Arreglos {

    fun primerArreglo(){

        val semanas = arrayOf(1,2,3,4,5,6)

        for (valor in semanas){
            Log.d("arreglos", "semana $valor")
        }

        semanas.first() // primer elemento
        semanas[1] = 50 //cambio de valor
        semanas.last() // ultimo elemento

        for ((posicion,valor) in semanas.withIndex()){
            Log.d("arreglos", "El valor de la posición $posicion es $valor")
        }
    }
}