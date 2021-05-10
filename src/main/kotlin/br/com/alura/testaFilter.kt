package br.com.alura

fun testaFilter() {

    listOf(
        Livro("José de Alencar", "Iracema"),
        Livro("Machado de Assis", "Quincas Borba"),
        Livro("Machado de Assis", "Memórias Póstumas de Brás Cuba"),
        Livro(obra = "Uma meia noite"),
        Livro(obra = "Quando todos dormem")
    ).filter { it.autor.isNotEmpty() }
        .forEach(::println)
}