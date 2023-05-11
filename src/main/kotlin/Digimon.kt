import alleAttacken.Attack

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
                    println("$name digitiert zuuuuun ${next.name}")

                }

                DigiLevels.Rookie -> {
                    this.stufe = DigiLevels.Champion
                    this.hp + 100
                    println("$name digitiert zuuuuun ${next.name}")
                }

                DigiLevels.Champion -> {
                    this.stufe = DigiLevels.Ultra
                    this.hp + 150
                    println("$name digitiert zuuuuun ${next.name}")
                }


                else -> {}
            }
        }


    }

    fun useAttack(index:Int,target:Evildigimon){

        val attack = attacken[index]
        println("$name setzt ${attacken[index]} ein")
        attack.use(target)
    }

    fun showHp(){
        println("$name hat $hp HP!")
    }

    fun dance(){
        println("$name dance!")
    }

    fun powerOfFriendschip(spieler:Player,p1:Digimon,p2:Digimon){
        if(hp<=1) {
            spieler.digivice = true
         println("$name glaubt an ${spieler.name}! Lass uns gemeinsam Digitieren.")
         println("$name und ${spieler.name} digitieren zu ${p2.name}")
            this.stufe = DigiLevels.Mega
            this.hp + 300
        }
    }





}

enum class DigiLevels{
    Baby, Rookie, Champion,Ultra,Mega
}