package br.com.dhan
fun main() {

    val x = 15

    when(x) {
        5 -> println("x == 5")
        8 -> println("x == 8")
        in 11..15 -> println("esta entre 11 e 15")//colocar um range para ele verificar
        !in 15..20 -> println("nao esta entre 15 e 20") //posso negar o range
        else -> println("else")
    }

    //usar o when sem passar alguma variavel
    when {
        comecaCompooi(4) -> println("é 4")
        comecaCompooi("oi") -> println("retornou o oi")
    }
}

fun comecaCompooi(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith("oi") // verifica se o valor do when: x é uma String, se for ele verifica se comeca com Ooi,
        else -> false
    }
}
