package br.com.alura

fun testaLambdaEAnonima() {

    // o que está entre {} é uma expressão/função lambda
    val calculaBonificacaoLambda: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000) {
            /*
            * essa estratégia de colocar uma label na função serve para quando precisamos utilizar o return, pois o
            * compilador iria retornar para a função superior, que no caso aqui é a testaLambdaEAnonima()
            * */
            return@lambda salario + 50
        }
        // aqui o return não seria mais necessário, pois padrão o retorno de uma lambda é sempre a última linha
        return@lambda salario + 100
    }

    println(calculaBonificacaoLambda(2500.0))


    // fun é uma função anônima
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun (salario): Double {
        if (salario > 1000) {
            return salario + 50
        }

        return salario + 100
    }

    println(calculaBonificacaoAnonima(1000.0))
}