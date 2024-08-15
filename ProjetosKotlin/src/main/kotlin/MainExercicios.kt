import POO.entities.Carro
import POO.entities.Contato
import POO.entities.Jogo
import POO.entities.Pessoa
import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    //ex09()
    //sequenciaDeCollatz()
    //ex18()
    //arrayDinamico()
//    var mcqueen = Carro()
//    mcqueen.marca = "nascar"
//    mcqueen.modelo = "katchau"
//
//    mcqueen.acelerar()
//
//    println(mcqueen.toString())

    var contato = Contato("ThiagogayL", "4355435-543534")

    contato.callar()

    var pessoa = Pessoa("eneas" , 10)

    pessoa.apresentar()

    var jogo1 = Jogo()

}

fun ex08() {

    println("fala um numero: ")
    var num = readln().toInt()
    var verifier = true

    for(i in 2 until num - 1){
        if(num % i == 0){
            println("não é primo")
            verifier = false
            break
        }
    }

    if(verifier) println("é primo")

}

fun ex09(){

    var anterior : Long = 1
    var atual : Long = 1
    var proximo : Long = 0

    for(i in 1..90){
        println(anterior)
        proximo = atual + anterior
        anterior = atual
        atual = proximo
    }

}

fun ex18(){
    println("digite o numero")
    var num = readln()

    var numb = num.toInt()

    var soma = Array(num.length+1) { 0 }

    for(i in 1..num.length){

        var divisao = pow(10.0, num.length - i.toDouble()).toInt()
        soma[i] = numb / divisao
        numb -= soma[i] * divisao
    }

    soma.forEach { valor -> soma[0] += pow(valor.toDouble() , num.length.toDouble()).toInt()}

    println(soma[0])


}

fun sequenciaDeCollatz(){
    println("digite um num")
    var num = readln().toInt()
    println(num)
    do{
        if (num % 2 == 0){
            num /= 2
        } else num = num * 3 + 1
        println(num)
    }while(num != 1)
}



fun arrayDinamico(){
    var valores = mutableListOf<Int>()

    valores.add(10)
    valores.add(10456)
    valores.add(10900)
    valores.add(100)

    println("adicioene numero")
    valores.add(readln().toInt())

    println(valores.joinToString())


}

