package listasDeExercicios.ex1.entities

class Livro(var titulo : String, var autor : String,var disponivel : Boolean) {

    constructor() : this("", "", false)

    override fun toString(): String {
        return "titulo: '$titulo', autor: '$autor', disponivel: $disponivel)"
    }

    fun ocupar(){
        disponivel = false
    }

    fun desocupar(){
        disponivel = true
    }
}
