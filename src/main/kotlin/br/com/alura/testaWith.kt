package br.com.alura

fun testaWith() {

    val livro = Livro("Guimarães Rosa", "Sertões")

    with(livro) {
        resumo() // vai ser o retorno do with
    }.let(::println)
}