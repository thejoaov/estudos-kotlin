package collections


data class Fruta(var nome: String, var preco: Double)

fun main() {
    val frutas = arrayListOf(Fruta("Banana", 1.50), Fruta("Morango", 3.20))

    for (fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }

    println(frutas.contains(Fruta("Banana", 1.50)))
    println(frutas.distinctBy { it.preco })
    frutas.add(Fruta("Vasco", 10.0))
}