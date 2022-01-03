package br.com.dhan


fun main() {

    for (numero in 1 .. 10) {
        println(numero)
    }

    //de traz para frente
    for (numero in 10 downTo 1) {
        println(numero)
    }

    //percore os numeros, pulando dois
    for(numero in 1 .. 10 step 2) {
        println(numero)
    }


}