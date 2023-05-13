package funcoes

fun incremento(num: Int): Int {
    //num++ // não pode ser reassignado
    return num + 1
}

fun main() {
    incremento(3)
}