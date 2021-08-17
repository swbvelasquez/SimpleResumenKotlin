package com.tutoriales.simpleresumenkotlin

import android.util.Log

class Listas {
    fun listaSimple(){
        val diasMes:List<Int> = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)

        Log.d("Listas", "¿Lista vacia? " +  diasMes.none())
        Log.d("Listas", "primer dia " +  diasMes.firstOrNull())
        Log.d("Listas", "dia " +  diasMes.elementAtOrNull(0))
        Log.d("Listas", "ultimo dia " +  diasMes.lastOrNull())
    }

    fun listaMutable(){
        val textos:MutableList<String> = mutableListOf("Pan","Cafe","Tostada","Mantequilla","Huevo","Jamon")
        val textosVacios:MutableList<String> = mutableListOf()

        textos.add(0,"Mermelada")

        var resultado = textos.filter { it == "Tostada" } //iteracion o bucle para buscar Tostada
        Log.d("Listas", "textos:  $resultado")

        resultado = textos.filter { it[0] == 'T' } // iteracion que busca la primera letra o caracter que sea T
        Log.d("Listas", "textos:  $resultado")

        textos.forEach {
            textosVacios.add("$it:") // it hace referencia al valor del elemento iterado
        }
    }
}