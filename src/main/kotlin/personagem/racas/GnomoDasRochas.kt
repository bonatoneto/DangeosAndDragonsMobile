package org.example.personagem.racas

class GnomoDasRochas : Gnomo() {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Constituição" to 1) + super.obterAprimoramento()
    }
}