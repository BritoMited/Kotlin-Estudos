import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    //ex09()
    sequenciaDeCollatz()
    //ex18()

}

fun ex08() {

    println("fala um numero: ")
    var num = readln().toInt()
    var verifier = true

    for(i in 2..num - 1){
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