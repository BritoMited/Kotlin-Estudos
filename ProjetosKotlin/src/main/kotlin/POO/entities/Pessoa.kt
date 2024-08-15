package POO.entities

class Pessoa(var nome : String, var idade : Int) {

    //receber apenas nome, setando a idade como 0
    constructor(nome: String) : this(nome, 0)


    //receber apenas a idade setando o nome como desconhecido
    constructor(idade : Int) : this("desconhecido", idade)

    fun apresentar(){
        println("meu nome é $nome e tenho $idade anos")
    }


}