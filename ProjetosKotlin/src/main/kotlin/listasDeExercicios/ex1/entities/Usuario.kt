package listasDeExercicios.ex1.entities

class Usuario(var nome: String = "", var livrosEmprestados: MutableList<Livro> = mutableListOf()) {

    constructor() : this("", mutableListOf())
}