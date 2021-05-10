package br.com.alura

data class Livro(var autor: String = "", val obra: String) {
    fun resumo(): String {
        return """
             $obra foi escrito por $autor           
        """.trimIndent()
    }
}