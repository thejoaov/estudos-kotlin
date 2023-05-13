package fundamentos.controles

fun main() {
    val nota: Double = 9.0

    when (nota) {
        in 9.0..10.0 -> print("Fantastique")
        in 7.0..9.0 -> print("Parabuains")
        in 4.0..7.0 -> print("REPROV... brincadeira po pegadinha memes")
        in 0.0..4.0 -> print("SE FUDEU")
        else -> print("Mermao vai toma no teu cu blz")
    }
}