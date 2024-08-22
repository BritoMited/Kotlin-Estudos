
package aula06

import aula06.exHeranca.* // tudo
import aula06.exInterface.*

// import aula06.exHeranca.Animal

fun main(){

    var pessoa = Pessoa("brito")
    var cavalo = Cavalo("pe de pano")
    var carro = Carro("xevrolete","hb20")

    pessoa.mover()
    cavalo.mover()
    carro.mover()
}

fun heranca(){

    var animal = Animal("Calopsita")
    var animalzin = Animal()
    var cachorro = Cachorro("Caramelo")
    var cachorro2 = Cachorro("lobinhu", "do thiago")
    var gato = Gato("miau", "preto")
    var gato2 = Gato("minhau", "tudas as cores")

    animal.comer()
    animalzin.comer()
    cachorro.comer()
    cachorro2.comer()
    gato.comer()
    gato2.comer()

}
