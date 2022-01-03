package br.com.dhan

fun main() {

    println("Inicio")

    var conta = Conta("Danilo", 10)
//    conta.nome = "Danilo" => como o tipo da variavel é "val" ela nao pode ser alterada
//    conta.titulo = "Ola"

    println("Nome ${conta.nome}")
    println(conta)
}

//funcao q retorna algo
fun reotrnaNome(): String {
    return "Danilo"
}

//class com construtor
class Conta(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "nome $nome idade $idade"
    }
}



