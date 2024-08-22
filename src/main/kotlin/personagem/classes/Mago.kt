package org.example.personagem.classes

class Mago : Classe {
    override fun obterHabilidades(): Map<String, Int> {
        return mapOf("Inteligência" to 3)
    }
}