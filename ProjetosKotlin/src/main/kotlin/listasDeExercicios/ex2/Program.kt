package listasDeExercicios.ex2

import listasDeExercicios.ex1.entities.Livro
import listasDeExercicios.ex2.models.Cliente
import listasDeExercicios.ex2.models.Item
import listasDeExercicios.ex2.models.Pedido

fun main(){

    var itens = mutableListOf(
            Item("maçâ", 10.00),
            Item("pera", 16.40),
            Item("melão", 10.30),
            Item("bananana", 34.00)
    )

    var cliente = Cliente("brito", 10.0)

    var pedido = Pedido()

    var op = 0

    do{
        println("bem vindo ao mercadin do bombadin")
        println("1 - mercadoria")
        println("2 - calcular pedido")
        println("5 - sair")
        op = readln().toInt()

        when(op){
            1 -> {
                do {
                    itens.forEachIndexed{ index, it -> println("$index: ${it.nome} R$ ${it.preco}") }

                    println("-1: Sair")
                    var escolha = readln().toInt()

                    if(escolha in itens.indices){
                        pedido.cliente = cliente
                        pedido.addItem(itens[escolha])
                    }else{
                        println("nao deu")
                    }
                }while (escolha != -1)

            }
            2 -> {
                println("informações do pedido")
                println("nome do pateta: " + pedido.cliente.nome)
                println("desconto disponivel: " + pedido.cliente.cupomDesconto + "%")
                println("itens: ")
                pedido.itens.forEach { println(it.nome + " R$" + it.preco) }
                println("preço total: " + pedido.calcTotal())
            }
        }



    }while (op != 5)

}