package fundamentos.controles

fun main() {
    var opcao = 0

    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Voce escolheu a opcap: $opcao")
    } while (opcao != -1)

    println("Ate a proxima")
}