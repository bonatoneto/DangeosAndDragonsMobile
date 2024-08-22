package org.example.personagem.racas

open class Elfo : Raca {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Destreza" to 2)
    }
}