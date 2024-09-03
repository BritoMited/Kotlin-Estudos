package listasDeExercicios.ex2.models

class Cliente(
        var nome : String,
        var cupomDesconto: Double
){

    constructor() : this("", 0.0)
}