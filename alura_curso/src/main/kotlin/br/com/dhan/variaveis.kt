package br.com.dhan

fun main() {
    var nome = "danilo" // variavel mutavel
    val nome2 = "fernandes" // variavel imutavel

    //como passar null para uma variavel, colocando o ? no final do tipo, torna ela nullable
    var nome3: String? = null

    //como ignorar q variavel nao sera null, colocando !! no final da variavel
    var toShort: Short = nome3!!.length.toShort()

    //elvis operator: para caso de variavel nullable, e queremos passar um else de valor
    var nome4: String? = null
    var tam: Int = nome4?.length ?: 0

}

class Variaveis {
    //    val teste: String//variaveis  de field precisam ter um valor
    lateinit var teste: String //colocando o lateinit, informa q o valor vira depois


    //funcao em class
    fun iniciarVariaives() {
        teste = "teste"
    }

}