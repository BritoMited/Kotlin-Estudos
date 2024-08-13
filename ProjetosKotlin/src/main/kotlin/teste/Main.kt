fun main() {

    ex17()

}

fun exemploArray1() {

    var numeros = arrayOf(1, 2, 3, 4, 5)
    var nomes = arrayOf("Ana", "Bruno", "Carlos")

    println("Número na pos 0 do array de numeros: " +
            numeros[0])

    println("Nome na pos 1 do array nomes: " +
            nomes[1])

    // mostrando dados do array utilizando for

    println("Valores do array numeros:")

    for (numeroAtual in numeros) {
        print("$numeroAtual ")
    }

    // mostrando dados do array nomes utilizando foreach
    println("\nNomes do array nomes:")
    nomes.forEach { nomeAtual -> print("$nomeAtual ") }

}

fun exemploFunSimples() {

    val media = calcularMedia(5f, 7.2f, 3.7f)
    val notaFormatada = String.format("%.1f", media)
    print("Média do aluno: $notaFormatada")

}

fun calcularMedia(n1: Float, n2: Float, n3: Float) : Float {
    val media = (n1+n2+n3)/3
    return media
}

fun exemploCompanionObject() {

    println ("75 + 379 = ${Calculadora.somar(75, 379)}")
    println("87 - 13 = ${Calculadora.subtrair(87, 13)}")

}

fun ex01() {

    var idades = Array(5) {0} // criando array sem valores

    for (i in idades.indices) {
        print("Informe uma ${i+1}ª idade: ")
        idades[i] = readln().toInt()
    }

    // calcula a media dos valores do array
    val media = idades.average()
    println("\nMédia das idades: $media")

}

fun ex02() {

    var temperaturas = Array(7) { 0f }

    var min : Float = 0f
    var max : Float = 0f

    for (i in temperaturas.indices) {
        print("Informe a temperatura do ${i+1}º dia: ")
        temperaturas[i] = readln().toFloat()

        /*
        if (i == 0) {
            min = temperaturas[0]
            max = temperaturas[0]
        } else {

            if (temperaturas[i] > max) {
                max = temperaturas[i]
            } else if (temperaturas[i] < min) {
                min = temperaturas[i]
            }

        }*/

        // melhorando a abordagem com o when
        when {
            i == 0 -> {
                min = temperaturas[0]
                max = temperaturas[0]
            }
            temperaturas[i] > max -> max = temperaturas[i]
            temperaturas[i] < min -> min = temperaturas[i]
        }

    }

    // verificar valor minimo e maximo dentro um array
    min = temperaturas.min()
    max = temperaturas.max()

    println("Temperatura mínima: $min")
    println("Temperatura máxima: $max")

}

fun ex05() {

    var nomes = Array(5) { "" }

    for (i in nomes.indices) {
        print("Digite o ${i+1}º nome: ")
        nomes[i] = readln()
    }

    // ordenar os nomes em ordem alfabetica
    nomes.sort()

    println("Nome em orgem alfabética: ")
    nomes.forEach { nomeAtual -> println(nomeAtual) }

}

fun ex17() {

    println("Id atual: ${Exercicio17.gerarID()}")
    println("Id atual: ${Exercicio17.gerarID()}")
    println("Id atual: ${Exercicio17.gerarID()}")
    println("Id atual: ${Exercicio17.gerarID()}")
    println("Id atual: ${Exercicio17.gerarID()}")
}