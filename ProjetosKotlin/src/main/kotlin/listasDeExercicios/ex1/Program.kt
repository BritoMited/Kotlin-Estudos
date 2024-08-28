package listasDeExercicios.ex1

import listasDeExercicios.ex1.entities.Livro
import listasDeExercicios.ex1.entities.Usuario

fun main() {

    var livros = mutableListOf(
            Livro("O ESTRANHO MISTERIOSO", "MARK TWAIN", true),
            Livro("FLORES PARA ALGERNON", "DANIEL KEYES", true)
    )

    val usu = Usuario("bito")

    var op = 0

    do{
        println("bem vindo a biblioteca")
        println("1 - livros para emprestar")
        println("2 - livros para devolver")
        println("5 - sair")
        op = readln().toInt()

        when(op){
            1 -> {
                    livros.forEach {
                        println(it)
                    }
                do{
                    println("qual gostaria de emprestar?")
                    var nome = readln()
                    var ver = 1

                    livros.forEach{
                        if(it.disponivel && it.titulo == nome){
                            it.ocupar()
                            usu.livrosEmprestados.add(it)
                            ver = 2
                        }
                    }
                    if(ver == 1) println("livro nao encontrado ou indisponivel!")

                }while (ver == 1)



            }
            2 -> {

                usu.livrosEmprestados.forEach{
                    println(it)
                }
                println("qual gostaria de devolver?")
                var nome = readln()

                var livro = Livro()

                usu.livrosEmprestados.forEach{
                    if(it.titulo == nome) {
                        it.desocupar()
                        livro = it
                    }
                }
                usu.livrosEmprestados.remove(livro)

            }
        }



    }while (op != 5)




}