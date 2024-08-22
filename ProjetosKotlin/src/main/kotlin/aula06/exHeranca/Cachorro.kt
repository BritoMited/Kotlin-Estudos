package aula06.exHeranca

class Cachorro(nome: String, var raca: String) : Animal(nome) {

    constructor(nome: String) : this(nome, "turn tin")

    override fun comer() {
        println("O cachorro $nome ($raca) ta comeno ração esse bobin")
    }

}