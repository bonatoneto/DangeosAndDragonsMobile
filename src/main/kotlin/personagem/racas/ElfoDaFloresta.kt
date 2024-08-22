package org.example.personagem.racas

class ElfoDaFloresta : Elfo() {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Sabedoria" to 1) + super.obterAprimoramento()
    }
}