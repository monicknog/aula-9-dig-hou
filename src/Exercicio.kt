fun main(){
    var loteria = mapOf(0 to "Ovo", 1 to "Água", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo")
    println((loteria.values))

    var apelidos = mapOf(
        "João" to listOf("Juan", "Fissura", "Maromba"),
        "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
        "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
        "Lucas" to listOf("Lukinha", "Jorge", "George")
    )

    loteria.forEach{ println(it) }
    apelidos.forEach{ println(it) }

    var lista = mutableListOf<Int>()

    lista.add(1)
    lista.add(5)
    lista.add(5)
    lista.add(6)
    lista.add(7)
    lista.add(8)
    lista.add(8)
    lista.add(8)

    var lista2 = mutableSetOf<Int>()
    lista2.add(1)
    lista2.add(5)
    lista2.add(5)
    lista2.add(6)
    lista2.add(7)
    lista2.add(8)
    lista2.add(8)
    lista2.add(8)

    lista.forEach {
        println(it)
    }

    lista2.forEach {
        println(it)
    }

    var prova = Prova()
    prova.somaTotal(lista2)

}

abstract class Peca(val nome: String, val modelo: String){
    fun retirada(){

    }
}

class GuardaVolume(nome: String, modelo: String) : Peca(nome, modelo){

}

class Prova(){
    fun somaTotal(items: Set<Int>){
        var soma = 0
        items.forEach {
            soma+=it
        }
        println(soma)
    }
}