package com.example.enumsandlambdas

enum class SistemaOperativo {
    WINDOWS,
    MAC,
    LINUX,
    ANDROID,
    IOS,
    CHROME_OS,
    SOLARIS;
}

enum class Android(val version:Int, val descripcion:String) {
    S(12,"ültima"),
    R(11, "antepenulimta"),
    Q(10, " La chida");
}
