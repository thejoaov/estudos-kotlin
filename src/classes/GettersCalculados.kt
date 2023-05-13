package classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean) {
    val inativo: Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)
}

fun main(args: Array<String>) {
    val p1 = Produto("iPad", 2349.99, 0.20, ativo = true)
    println(p1.precoComDesconto)
    val p2 = Produto("Galaxy S22", 2699.99, 0.50, ativo = false)
    println("-- IMPERDÍVEL ---\nÉ pra queimar o estoque! O gerente ficou maluco e ta dando dedada no cu dos cliente!\n\n${p2.nome}\n\tDe: R$${p2.preco} \n\tPor apenas: ${p2.precoComDesconto}!!!")

    if (p2.inativo) {
        p2.preco = 0.0
        println("Depois de inativo: R$ ${p2.precoComDesconto}")
    }
}