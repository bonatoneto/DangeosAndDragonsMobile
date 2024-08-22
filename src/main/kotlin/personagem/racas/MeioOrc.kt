package org.example.personagem.racas

class MeioOrc : Raca {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Força" to 2, "Constituição" to 1)
    }
}