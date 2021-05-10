package br.com.alura

fun testaApply() {

    val livro = Livro(obra = "Veredas").apply {
        autor = "Guimarães Rosa" // o autor é um var em Livro
    }

    println(livro)
}