package fundamentos

fun main() {
    val a = 1


    // Numero pra string
    println(a.toString() + 1)

    // String pra numero
    println("1.9".toDouble() + 3)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull()?:0)
    println("1".toInt()+3)

}