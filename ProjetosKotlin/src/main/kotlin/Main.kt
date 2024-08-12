import java.awt.PageAttributes.PrintQualityType

fun main() {
     //exemploFor1()
     //exemploFor2()
     //exemploFor3()
     //exemploIfTernario()
     //exemploWhen1()
     //exemploWhen2()
     exercicio01()
     //exercicio02()
     //exercicio07()
    //exercicio08()
}

 fun exemploFor1(){
     for (i in 1 .. 10){
         println("Valor atual do contador: $i")
     }
 }

 fun exemploFor2(){
     println("Contagem Regressiva")
     for (i in 10 downTo  1){
         println("Valor atual do contador: $i")
     }
     println("Lançar")
 }

 fun exemploFor3(){
     println("Valores ímpares entre 1 e 15")
     for (i in 1 .. 15 step 2){
         println("Valor atual do contador: $i")
     }
 }
 fun exemploIfTernario(){
     var a = 15
     var b = 10

     var max = if(a > b) a else b

     println("Valor de max: $max")

 }

 fun exemploWhen1(){
     val x = 0

     when (x) {
         1 -> println("X vale 1 mae")
         2 -> println("X vale 2 maes")
         else -> println("X n vale nem 1, nem 2")
         //similar a switch case
     }
 }

 fun exemploWhen2(){
     val x = 0

     when {
         x > 0 -> println("Maior q 0")
         x < 0 -> println("Menos q 0")
         else -> println("X é 0 HAHHAA")
     }
 }

 fun exercicio01(){
     println("Exercício 1 - Média das notas")

     println("Informe a Nota da priemira nota")
     var n1 = readln()!!.toFloat()
     println("Valor da nota1: $n1")

     println("Informe a Nota da seugnda nota")
     var n2 = readln()!!.toFloat()
     println("Valor da nota2: $n2")

     println("Informe a Nota da priemira nota")
     var n3 = readln()!!.toFloat()
     println("Valor da nota3: $n3")

     var media = (n1 + n2 + n3) / 3

     var mediaFormatada = String.format("%.2f", media)

     if(media >= 7){
         println("Aprovado com média $mediaFormatada")
     }
     else{
         println("Reprovado com média $mediaFormatada")
     }
 }

 fun exercicio02(){
     println("Exercício 2 - Par ou Ímpar")

     println("Informe um Valor Inteiro")
     var valor = readln()!!.toInt()

     when{
         valor % 2 == 0 -> println("$valor é par!")
         valor % 2 != 1 -> println("$valor é impar!")
     }
 }

 fun exercicio07(){
     println("Exercicio 07: Contar vogais numa palavra")

     println("Digite uma palavra: ")
     var palavra = readln()

     var qtdeVogais = 0 // zero vogais neste momento
     var qtdeConsoantes = 0

     for (letra in palavra){
         if (letra.lowercaseChar() in "aeiou"){
             qtdeVogais++
         }
         else{
             qtdeConsoantes++
         }
     }

     println("Existem $qtdeVogais vogais na palavra '$palavra' e $qtdeConsoantes consoantes")

 }

fun exercicio08(){
    println("Exercicio 08 - Verificar se um numero é primo")

    println("Informe um numero inteiro:")
    var numero = readln().toInt()
    var primo = true

    for (i in 2 .. numero/2)
        if (numero % i == 0){
            primo = false
            break
        }
    if (primo){
        println("o numero $numero é primo")
    }
    else{
        println("o numero $numero não é primo")
    }
}
