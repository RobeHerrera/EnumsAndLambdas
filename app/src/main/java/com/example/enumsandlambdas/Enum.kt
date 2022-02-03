package com.example.enumsandlambdas

fun main(){
    descarga(SistemaOperativo.ANDROID)
    descarga(SistemaOperativo.WINDOWS)
    operacionar(Operaciones.SUMA,10,10)
    operacionar(Operaciones.RESTA,-10,-5)
    operacionar(Operaciones.MULTIPLICACION,15,10)

    val isEmptyLogin = fun (usuario: String, password: String):Boolean{
        return usuario.isEmpty() || password.isEmpty()
    }

    val isLoginOK = mandarDatos("Robert","",isEmptyLogin)
    println(isLoginOK)

}
    private fun mandarDatos(usuario:String, password:String, function:(String,String)->Boolean):Boolean{
        return !(function(usuario,password))
    }

fun operacionar(operacion: Operaciones, num1:Int, num2:Int){
    val resultado = operacion.resultado(num1,num2)
    println("el resultado es: $resultado")
}

fun descarga(sistema: SistemaOperativo){
    when(sistema){
        SistemaOperativo.WINDOWS -> println("Descargando para Windows")
        SistemaOperativo.MAC -> println("Descargando para Mac")
        SistemaOperativo.LINUX -> println("Descargando para Linux")
        SistemaOperativo.ANDROID -> println("Redirigiendo a la PlayStore")
        SistemaOperativo.IOS -> println("Redirigiendo a la AppsStore")
    }
    /*DurationUnit.SECONDS
    DurationUnit.DAYS
    DurationUnit.HOURS
    DurationUnit.MINUTES*/

}

