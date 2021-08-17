package com.tutoriales.simpleresumenkotlin

class Condicionales {
    
    fun mesDelAnio(mes:Int):String{
        return when(mes){
            1->"Enero"
            2->"Febrero"
            3->"Marzo"
            4->"Abril"
            5->"Junio"
            6->"Julio"
            else -> "No es un Mes"
        }
    }

    fun trimestreDelAnio(mes:Int):String{
        return when(mes){
            1,2,3->"Primer Trimestre"
            4,5,6->"Segundo Trimestre"
            7,8,9->"Tercer Trimestre"
            10,11,12->"Cuarto Trimestre"
            else -> "No es un Trimestre"
        }
    }

    fun semestreDelAnio(mes:Int):String{
        return when(mes){
            in 1..6->"Primer Semestre"
            in 7..12->"Segundo Semestre"
            !in 1..12 -> "No es un Semestre" //otra forma de control
            else -> "No es un Semestre"
        }
    }

    fun tipoVariable(tipo:Any):String{
        return when(tipo){
            is String -> "Es String"
            is Int -> "Es Int"
            is Boolean -> "Es Boolean"
            else -> "Otro tipo"
        }
    }
}