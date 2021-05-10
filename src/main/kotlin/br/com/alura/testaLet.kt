package br.com.alura

fun testaLet() {

    val livro = Livro("Machado de Assis", "Memórias Póstumas de Brás Cubas")
    // o let recebe o tipo função com a seguinte assinatura => (T) -> R. Recebe e retorna qualquer coisa.
    // perceba que abaixo passamos a função fora do parênteses, pois o Kotlin permite isso.
    // let é um higher-order function
    livro.let {
        println("${it.obra} de ${it.autor.uppercase()}") // aqui retorna um Unit
    }

    val frase = Livro("Machado de Assis", "Quincas Borba").let {
        "${it.obra} de ${it.autor.uppercase()}" // estou retornando essa String
    }
    println(frase)

    Livro("José de Alencar", "Iracema").let {
        "${it.obra} de ${it.autor.uppercase()}" // estou retornando essa String
    }.let (::println)
}

