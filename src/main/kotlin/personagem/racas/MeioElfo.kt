package org.example.personagem.racas

class MeioElfo : Elfo() {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Carisma" to 2) + super.obterAprimoramento()
    }
}