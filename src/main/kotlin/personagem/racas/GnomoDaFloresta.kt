package org.example.personagem.racas

class GnomoDaFloresta : Gnomo() {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Destreza" to 1) + super.obterAprimoramento()
    }
}