package classes

class ItemDePedido(var nome: String, val preco: Double) {
    companion object {
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)

        @JvmStatic
        var desconto: Double = 0.0
    }

    fun precoComDesconto(): Double {
        return preco - preco * desconto
    }
}

fun main() {
    val item1 = ItemDePedido("TV 50 Polegadas", 2899.90)
    val item2 = ItemDePedido("Computador 8 Gibas de memoria RAMBO", 4599.90)

    ItemDePedido.desconto = 0.10

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())

}