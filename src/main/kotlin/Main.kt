import org.example.personagem.Personagem
import org.example.personagem.classes.*
import org.example.personagem.racas.*

fun main() {
    // Solicitar escolha da raça
    println("Escolha uma raça:")
    val racasDisponiveis = listOf("Humano", "Elfo", "Anão", "Orc")
    racasDisponiveis.forEachIndexed { index, raca -> println("${index + 1}. $raca") }
    val escolhaRaca = readLine()?.toIntOrNull()?.minus(1) ?: 0
    val racaSelecionada: Raca = when (escolhaRaca) {
        0 -> Humano()
        1 -> Elfo()
        2 -> Anao()
        3 -> MeioOrc()
        else -> Humano() // valor padrão
    }

    // Solicitar escolha da classe
    println("Escolha uma classe:")
    val classesDisponiveis = listOf("Guerreiro", "Mago", "Ladino", "Clérigo")
    classesDisponiveis.forEachIndexed { index, classe -> println("${index + 1}. $classe") }
    val escolhaClasse = readLine()?.toIntOrNull()?.minus(1) ?: 0
    val classeSelecionada: Classe = when (escolhaClasse) {
        0 -> Guerreiro()
        1 -> Mago()
        2 -> Ladino()
        3 -> Clerigo()
        else -> Guerreiro() // valor padrão
    }

    // Solicitar definição dos atributos
    println("Agora, você vai definir os atributos do seu personagem.")
    val valoresAtributos = mutableMapOf<String, Int>()

    val atributos = listOf("Força", "Destreza", "Constituição", "Inteligência", "Sabedoria", "Carisma")
    val valoresBase = listOf(15, 14, 13, 12, 10, 8)

    atributos.forEach { atributo ->
        println("Atribua um valor para $atributo:")
        println("Valores disponíveis: ${valoresBase.joinToString(", ")}")
        val valorEscolhido = readLine()?.toIntOrNull()
        if (valorEscolhido != null && valorEscolhido in valoresBase) {
            valoresAtributos[atributo] = valorEscolhido
        } else {
            println("Valor inválido. Usando valor padrão.")
            valoresAtributos[atributo] = valoresBase[atributos.indexOf(atributo)]
        }
    }

    // Criar o personagem com as informações fornecidas
    val personagem = Personagem(racaSelecionada, classeSelecionada, valoresAtributos)

    // Exibir as informações finais do personagem
    println("Parabéns! Você criou o personagem:")
    println(personagem)
}