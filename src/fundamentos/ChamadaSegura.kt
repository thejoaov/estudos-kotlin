package fundamentos

fun main() {
    val a: Int? = null // safe call operator
    println(a?.dec())
}