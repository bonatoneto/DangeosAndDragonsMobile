package org.example.personagem.racas

open class Gnomo : Raca {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Inteligência" to 2)
    }
}