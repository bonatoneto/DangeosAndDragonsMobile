package org.example.personagem.racas

class Tiefling : Raca {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Inteligência" to 1, "Carisma" to 2)
    }
}