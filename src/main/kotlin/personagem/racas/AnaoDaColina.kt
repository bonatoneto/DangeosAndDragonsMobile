package org.example.personagem.racas

class AnaoDaColina : Anao() {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Sabedoria" to 1) + super.obterAprimoramento()
    }
}