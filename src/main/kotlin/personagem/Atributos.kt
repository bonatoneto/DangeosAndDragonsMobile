package org.example.personagem

data class Atributos(
    var forca: Int,
    var destreza: Int,
    var constituicao: Int,
    var inteligencia: Int,
    var sabedoria: Int,
    var carisma: Int
) {

    // Aplica os aprimoramentos recebidos aos atributos correspondentes
    fun aplicarAprimoramentos(aprimoramentos: Map<String, Int>) {
        aprimoramentos.forEach { (atributo, valor) ->
            when (atributo) {
                "Força" -> forca += 1
                "Destreza" -> destreza += 2
                "Constituição" -> constituicao += 3
                "Inteligência" -> inteligencia += 4
                "Sabedoria" -> sabedoria += 5
                "Carisma" -> carisma += 6
            }
        }
    }

    // Converte os atributos para um mapa
    fun toMap(): Map<String, Int> {
        return mapOf(
            "Força" to forca,
            "Destreza" to destreza,
            "Constituição" to constituicao,
            "Inteligência" to inteligencia,
            "Sabedoria" to sabedoria,
            "Carisma" to carisma
        )
    }
}
