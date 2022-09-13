package fundamentos.controles

fun main() {
    val alunos = arrayListOf("Andre", "Carla", "Marcos")

    for ((indice, aluno) in alunos.withIndex()){
        println("${indice.inc()}: $aluno")
    }

}