open class Digimon(
    var hp:Int,
    name:String,
    var stufe: DigiLevels,
    var attacken:MutableList<Attack>
    ):Item(name) {



    fun evolve(spieler:Player,next:Digimon){
        if(spieler.digivice) {
            when (this.stufe) {
                DigiLevels.Baby -> {
                    this.stufe = DigiLevels.Rookie
                    this.hp + 50

                }

                DigiLevels.Rookie -> {
                    this.stufe = DigiLevels.Champion
                    this.hp + 100
                    println("$name digitiert zuuuuun ${next.name}")
                }

                DigiLevels.Champion -> {
                    this.stufe = DigiLevels.Ultra
                    this.hp + 150
                }


                else -> {}
            }
        }


    }

    fun useAttack(index:Int,target:Evildigimon){

        val attack = attacken[index]
        println("$name setzt ${attacken[0]} ein")
        attack.use(target)
    }

    fun showHp(){
        println("$name hat $hp HP!")
    }

    fun dance(){
        println("$name dance!")
    }

    fun powerOfFriendschip(spieler:Player){
        if(hp<=50) {
            spieler.digivice = true
            ("$name glaubt an ${spieler.name}! Lass es gemeinsam tun.")
            this.stufe = DigiLevels.Mega
            this.hp + 300
        }
    }





}

enum class DigiLevels{
    Baby, Rookie, Champion,Ultra,Mega
}