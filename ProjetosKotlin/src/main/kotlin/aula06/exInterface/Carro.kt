package aula06.exInterface

class Carro(var marca: String,var modelo: String) : IAcoes {
    override fun mover() {
        println("VRRRRRRRRRRRRRRRRRRRRRUMMMMMMMMMMMMMMMMMMMMMMM!!!!!!!")
    }
}