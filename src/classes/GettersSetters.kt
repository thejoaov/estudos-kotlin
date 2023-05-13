package classes

class Cliente2 {
    constructor(nome: String) {
        this.nome = nome
    }

    var nome: String
        get() = "Meu nome é ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}

fun main() {
    val cliente = Cliente2("José do furico trancado")
    println(cliente.nome)

    val cliente2 = Cliente2("")
    println(cliente2.nome)

    val cliente3 = Cliente2("")
    cliente3.nome = "Zezin"
    println(cliente3.nome)
}