package POO.entities

class Contato(var nome : String, var fone : String) {
    fun callar(){
        println("ligando pra um tal de $nome, que tem o numero $fone")
    }


}