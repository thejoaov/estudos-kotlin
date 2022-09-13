package fundamentos.operadores

fun main() {
    val trabalho1 = true
    val trabalho2 = true

    val sorvete = trabalho1 || trabalho2
    val tv50 = trabalho1 && trabalho2
    val tv32 = trabalho1 xor trabalho2

    println(sorvete)
    println(tv50)
    println(tv32)

    // Operador unario
    if (!sorvete) {
        println("A saude agradece!")
    }
}