package com.tutoriales.simpleresumenkotlin

import android.util.Log

class Listas {
    fun listaSimple(){
        val diasMes:List<Int> = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)

        Log.d("Listas", "primer dia " +  diasMes.first())
        Log.d("Listas", "dia " +  diasMes.get(0))
        Log.d("Listas", "ultimo dia " +  diasMes.last())

    }
}