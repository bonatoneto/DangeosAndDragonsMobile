package org.example.personagem.classes

class Ladino : Classe {
    override fun obterHabilidades(): Map<String, Int> {
        return mapOf("Destreza" to 3, "Inteligência" to 1)
    }
}