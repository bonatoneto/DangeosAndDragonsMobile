package org.example.personagem.classes

class Barbaro : Classe {
    override fun obterHabilidades(): Map<String, Int> {
        return mapOf("Força" to 3, "Constituição" to 2)
    }
}