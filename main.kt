fun recomendarFilmes(idade: Int): String {
    return when (idade) {
        in 0..12 -> "Recomendamos filmes infantis."
        in 13..18 -> "Recomendamos filmes adolescentes."
        else -> "Recomendamos filmes para adultos."
    }
}

fun main() {
    print("Informe sua idade: ")
    val idade = readLine()!!.toInt()
    val recomendacao = recomendarFilmes(idade)
    println(recomendacao)
}