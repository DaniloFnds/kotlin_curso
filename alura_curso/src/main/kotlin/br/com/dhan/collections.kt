package br.com.dhan

fun main() {


    //pasar q uma lista, q aceita null
    var lista: List<Int> = listOf(1, 2, 3)


    //o acesso aos elemento da lista é o it
    lista.filter { it % 2 == 2 }
    //pegar so o primeiro
    lista.filter { it % 2 == 2 }.first()
    lista.first()
    //foreach
    lista.forEach({ println(it) })

    //forindex
    for(num in lista) {
        println(num)
    }

    //pegar array
    lista[0]
    //pegar por get
    lista.get(0)

    //trabalahr com lista mutaveis
    var listaMut = mutableListOf(1, 2, 3)

    listaMut.add(9)

    //mudar o valor do elemento por array
    listaMut[0] = 8

    //embaralhar
    listaMut.shuffle()


    //collection Set
    var sets = setOf(3, 54)


    //collection: map
    var mapa = mapOf("danilo" to 20, "fernandes" to 20)
    //map mutavel
    var mapaMut = mutableMapOf("danilo" to 434)
    mapaMut.put("fernandes", 404)
    //poegar por array key
    mapaMut["danilo"] = 30



}