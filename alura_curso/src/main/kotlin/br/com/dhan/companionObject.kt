package br.com.dhan

fun main() {

    var segundaClass = MinhaClasse.criaSegundaClass();
    var minhaClass = SegundaClasse().criaMinhaClass()
}


class MinhaClasse {
    //companion object é como se fosse um metodo static dentro da class
    //assim ela fica acessivel so chamanado o nome da class,sem precisar instanciar a msm
    companion object {
        fun criaSegundaClass(): SegundaClasse {
            return SegundaClasse()
        }
    }
}

class SegundaClasse {

    fun criaMinhaClass(): MinhaClasse {
        return MinhaClasse()
    }
}