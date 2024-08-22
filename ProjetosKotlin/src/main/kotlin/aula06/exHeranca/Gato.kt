package aula06.exHeranca

class Gato(nome: String, var cor: String): Animal(nome) {

    constructor(nome : String): this(nome, "transparente")

    override fun comer() {
        println("O gato $cor $nome ta comendo sache")
    }

}