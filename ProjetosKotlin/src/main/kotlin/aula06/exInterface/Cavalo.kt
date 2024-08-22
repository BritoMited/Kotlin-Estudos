package aula06.exInterface

class Cavalo(var nome: String): IAcoes {

    override fun mover() {
        println("relinchando and galoping")
    }

}