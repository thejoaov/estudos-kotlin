package fundamentos.operadores

fun obterResultado(nota: Double): String = if (nota >= 7.0) "Passou" else "Reprovou"


fun main() {
    print(obterResultado(6.3))
}