package org.example.personagem
import org.example.personagem.classes.Classe
import org.example.personagem.racas.Raca

class Personagem(val raca: Raca, val classe: Classe, var atributos: MutableMap<String, Int>) {

    // Extensão para aplicar aprimoramentos ao mapa de atributos
    fun MutableMap<String, Int>.aplicarAprimoramentos(aprimoramentos: Map<String, Int>) {
        aprimoramentos.forEach { (atributo, incremento) ->
            this[atributo] = (this[atributo] ?: 0) + incremento
        }
    }
    // Método para aplicar os aprimoramentos da raça aos atributos do personagem
    fun aplicarAprimoramentosRaca() {
        val aprimoramentos = raca.obterAprimoramento()
        atributos.aplicarAprimoramentos(aprimoramentos)
    }

    // Método para obter habilidades da classe
    fun obterHabilidadesClasse(): Map<String, Int> {
        return classe.obterHabilidades()
    }

    // Método que combina os aprimoramentos de raça e habilidades da classe
    fun obterAprimoramentos(): Map<String, Int> {
        aplicarAprimoramentosRaca()
        return atributos.toMap() + obterHabilidadesClasse()
    }
}
