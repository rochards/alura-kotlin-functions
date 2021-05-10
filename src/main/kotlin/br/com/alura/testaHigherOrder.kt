package br.com.alura

fun testaHigherOrder() {

    sum(25, 14) {
        println(it)
    }

    /*
    * aqui passo a referência de println para o resultado. Isso só é possível pq println tem a mesma assinatura de
    * resultado
    * */
    sum(1, 6, ::println)
}

// sum é higher-order function pq ela recebe outra como parâmetro
private fun sum(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}