package org.example.personagem.racas

class AnaoDaMontanha : Anao() {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Força" to 2) + super.obterAprimoramento()
    }
}