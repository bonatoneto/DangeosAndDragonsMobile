package org.example.personagem.classes

class Bardo : Classe {
    override fun obterHabilidades(): Map<String, Int> {
        return mapOf("Carisma" to 3)
    }
}