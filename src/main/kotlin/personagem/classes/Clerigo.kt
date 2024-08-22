package org.example.personagem.classes

class Clerigo : Classe {
    override fun obterHabilidades(): Map<String, Int> {
        return mapOf("Sabedoria" to 3, "Carisma" to 1)
    }
}