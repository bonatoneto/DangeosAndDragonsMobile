package org.example.personagem.racas

// AltoElfo.kt
class AltoElfo : Elfo() {
    override fun obterAprimoramento(): Map<String, Int> {
        return mapOf("Inteligência" to 1) + super.obterAprimoramento()
    }
}