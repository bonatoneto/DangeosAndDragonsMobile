package org.example.personagem.classes

class Druida : Classe {
    override fun obterHabilidades(): Map<String, Int> {
        return mapOf("Sabedoria" to 2, "Inteligência" to 1)
    }
}