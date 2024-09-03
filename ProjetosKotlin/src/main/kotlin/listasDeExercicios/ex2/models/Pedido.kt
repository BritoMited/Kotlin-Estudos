package listasDeExercicios.ex2.models

class Pedido(
        var itens : MutableList<Item> =  mutableListOf(),
        var cliente : Cliente
) {


    constructor() : this(mutableListOf(), Cliente())

    fun addItem(item: Item){
        itens.add(item)
    }

    fun calcTotal(): Double {
        var sum = 0.0

        for (i in itens) {
            sum += i.preco
        }

        if (cliente.cupomDesconto > 0) {
            var desconto =  cliente.cupomDesconto/ 100
            return sum - (sum * desconto)
        }

        return sum

    }

}