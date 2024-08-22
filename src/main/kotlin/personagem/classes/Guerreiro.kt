package org.example.personagem.classes

class Guerreiro : Classe {
    override fun obterHabilidades(): Map<String, Int> {
        return mapOf("Força" to 2, "Constituição" to 2)
    }
}
