open class Egg(name:String, var hatch:Int):Item(name){



    fun getPet(person:Player){
        hatch++
    }


    open fun schluepfen(player:Player,partner:Digimon){
        if ( hatch > 5)
            player.inventar.remove(this)

            println("""
                oh dein Ei ist geschlüpft!   
            """.trimIndent()
            )
    }
}