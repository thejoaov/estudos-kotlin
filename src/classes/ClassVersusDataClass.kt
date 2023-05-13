package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main() {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    println(g1 == g2) // class normal: equals compara as instâncias, como são diferentes, logo dá false, mesmo com '==='

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)

    println(tv1 == tv2) // data class: equals compara apenas os objetos, como são iguais, o resultado dá true
    println(tv1 === tv1) // agora o equals compara a instância, logo, dá false

    println(g1.toString()) // class normal: toString imprime a instância
    println(tv1.toString()) // data class: toString imprime o objeto

    println(tv1.copy())
    println(tv1.copy(polegadas = 42))

    // Destructuring em data class
    val (marca, pol) = tv1
    println("$marca $pol")
}