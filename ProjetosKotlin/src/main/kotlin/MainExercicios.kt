fun main(){

    ex09()

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