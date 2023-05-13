package lambdas

fun main(args: Array<String>) {
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)

    for (item in listWithNulls) {
        item?.let { println(it) }
    }

    val listFiltered = listWithNulls.filter { !it.isNullOrEmpty() }

    println(listFiltered)
}