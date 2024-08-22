package org.example.personagem.racas

class Drow : Raca {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Carisma" to 1)
    }
}