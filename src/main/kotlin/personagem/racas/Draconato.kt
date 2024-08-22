package org.example.personagem.racas

class Draconato : Raca {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Força" to 2, "Carisma" to 1)
    }
}