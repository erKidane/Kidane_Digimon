class Player(
    var name: String,
    var inventar:MutableList<Item>,
    var digivice:Boolean,
) {



    constructor(name:String, inventar:MutableList<Item>,digivice: Boolean,partner:Digimon):this(name,inventar, digivice) {



    }

    fun getEgg(item:Egg){                      //soll man nur einmal machen können
        inventar.add(item)
        println("$name hat ein Ei erhalten.")
    }

    fun printInventar(){

        println(inventar)

    }

    fun startBattle() {
        println("ich zähle auf dich ${partner.name}.")
    }


}