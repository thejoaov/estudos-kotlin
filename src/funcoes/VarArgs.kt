package funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray {
    println(a)
    return numeros.sortedArray()
}

fun main() {
    for (n in ordenar(12, 24, 23, 11, 23, 4, 24, 98, 1, a = 1)) {
        print("$n ")
    }
}