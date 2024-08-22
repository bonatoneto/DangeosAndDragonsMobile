package org.example.personagem.classes

class Monge : Classe {
    override fun obterHabilidades(): Map<String, Int> {
        return mapOf("Destreza" to 2, "Sabedoria" to 2)
    }
}