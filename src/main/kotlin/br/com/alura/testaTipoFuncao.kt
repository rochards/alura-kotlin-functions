package br.com.alura

fun testaTipoFuncao() {

    val func: () -> Unit = ::teste // esse :: significa que estou passando a referência da função
    println(func)
    func() // aqui executa de fato a função
}

private fun teste() {
    println("Testa tipo função")
}