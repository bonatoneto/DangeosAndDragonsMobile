package org.example.personagem.racas

class HalflingPesLeves : Halfling() {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Carisma" to 1) + super.obterAprimoramento()
    }
}