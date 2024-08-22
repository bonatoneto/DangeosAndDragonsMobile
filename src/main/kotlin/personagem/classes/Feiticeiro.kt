package org.example.personagem.classes

class Feiticeiro : Classe {
    override fun obterHabilidades(): Map<String, Int> {
        return mapOf("Carisma" to 2, "Inteligência" to 1)
    }
}