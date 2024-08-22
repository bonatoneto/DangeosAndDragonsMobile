package org.example.personagem.classes

class Paladino : Classe {
    override fun obterHabilidades(): Map<String, Int> {
        return mapOf("Força" to 2, "Sabedoria" to 2, "Carisma" to 1)
    }
}