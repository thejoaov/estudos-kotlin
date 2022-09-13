package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main() {
    kotlin.io.println(funcaoSimples("OK"))
    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    println("soma: ${soma(2,3)}, subtracao: ${subtracao(4,6)}")
}