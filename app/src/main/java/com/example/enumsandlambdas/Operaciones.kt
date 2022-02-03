package com.example.enumsandlambdas

enum class Operaciones {
    SUMA,RESTA,MULTIPLICACION,DIVISION;

    fun resultado(x:Int , y:Int):Int{
        return when(this){
            SUMA -> x+y
            RESTA -> x-y
            MULTIPLICACION -> x+y
            DIVISION -> x/y
        }
    }
}