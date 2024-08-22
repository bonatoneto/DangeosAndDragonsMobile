package org.example.personagem.racas

open class Anao : Raca {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Constituição" to 2)
    }
}