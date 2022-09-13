package classes

class Data(var dia:Int, var mes: Int, var ano: Int) {
    fun formatar():String{
        return "$dia/$mes/$ano"
    }
}

fun main() {
    var nascimento: Data = Data(9, 6,1996)

    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    with(nascimento) { println("$dia/$mes/$ano") }

    nascimento.mes = 11
    println(nascimento.formatar())
}