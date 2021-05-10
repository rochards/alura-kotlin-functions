package br.com.alura

fun testaLambda() {

    //    val sum: (Int, Int) -> Int = {x, y -> x + y}
    val sum: (x: Int, y: Int) -> Int = {x, y -> x + y } // dessa os parâmetros x e y aparecem como documentação
//    val sum = {x: Int, y: Int -> x + y}
    println(sum(25, 14))
}