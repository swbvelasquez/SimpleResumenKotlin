package com.tutoriales.simpleresumenkotlin

import android.util.Log

class Funciones {

    fun iniciarFuncion(){
        sumar1() //sin parametros
        sumar2(10,15) //con parametros
        sumar3(numero2 = 50)  //parametros opcionales
        sumar4(10,10) // con dato de retorno
    }

    fun sumar1(){
        val numero1:Int = 20
        val numero2:Int = 30

        val resultado:Int = numero1+numero2

        Log.d("Funciones", "Resultado: $resultado")
    }

    fun sumar2(numero1:Int, numero2:Int){

        val resultado:Int = numero1+numero2

        Log.d("Funciones", "Resultado: $resultado")
    }

    fun sumar3(numero1:Int=15, numero2:Int){

        val resultado:Int = numero1+numero2

        Log.d("Funciones", "Resultado: $resultado")
    }

    fun sumar4(numero1:Int, numero2:Int):Int{

        val resultado:Int = numero1+numero2

        Log.d("Funciones", "Resultado: $resultado")

        return resultado
    }
}