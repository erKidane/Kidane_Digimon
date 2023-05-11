import alleAttacken.Attack

class Evildigimon (
    var hp:Int,
    var name:String,
    var stufe:DigiLevels,
    var spawn:Boolean,
    var attacken:MutableList<Attack>,
    var lootItems:MutableList<Item>
) {

    fun spawn() {
        spawn = true
        println("$name is spawned!")

    }

    fun despawn(evilD:Evildigimon) {
        spawn = false
    }

    fun loot(spieler:Player) {
        if(this.hp == 0) {
            lootItems.removeAll(lootItems)
            spieler.inventar.addAll(lootItems)
        }
    }

    fun bossAttack(index:Int,target:Digimon){
        val attack = attacken[index]
        println("$name setzt ${attacken[index]} ein")
        attack.use(target)
    }

    fun showHp() {
        println("$name hat $hp HP!")
    }

    fun evilEvolve(next:Evildigimon) {
        if(hp <= 50 ){
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



}
