package POO.entities

class Carro {
    var marca : String = ""
    var modelo : String = ""


    fun acelerar(){
        println("hotwheels vai encarar")
    }

    override fun toString(): String {
        return "Carro(marca='$marca', modelo='$modelo')"
    }


}