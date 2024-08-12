package aula03

fun main(){

    companionObject()

}

fun exArray01(){
    var numeros = arrayOf(1,32,32,4,4365,46)

    var nomes = arrayOf("deivi jones", "BRITO MITED", "MANICREFT")

    println("" + numeros[1] +""+ nomes[1])

    numeros.forEach { num -> println(num) }

    nomes.forEach { nomeAtual -> println(nomeAtual) }
}

fun exemplos(){

    exArray01()

  //  println(calculoMediaToInt(1.6f, 10.5f, 5.7f))

    println(String.format("%.2f", calculoMedia(1.6f, 10.5f, 5.7f)))
}

//fun calculoMediaToInt(n1: Float,n2: Float,n3: Float): Int{
//    val media = n1+n2+n3/3
//    return media.toInt()
//}

fun calculoMedia(n1: Float,n2: Float,n3: Float): Float{
    val media = n1+n2+n3/3
    return media
}

fun companionObject(){
    println("1 + 3 = ${Calculadora.somarDeDoisValoresInteirosNumero1eNumero2QueONumero2EAdicionadoAoNumero1(1,3)}")
    println("99 - 5 = ${Calculadora.subtrairDeDoisValoresInteirosNumero1eNumero2QueONumero2ESubtraidoDoNumero1(99, 5)}")
}