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
        if(this.hp <= 0) {
           for(i in lootItems) {
               lootItems.remove(i)
               spieler.inventar.add(i)
           }

        }
    }

    fun bossAttack(index:Int,target:Digimon){
        if(this.hp > 0) {
            val attack = attacken[index]
            println("$name setzt ${attacken[index]} ein")
            attack.use(target)
        }else if(this.hp < 0){
            println("$name: aaaa ich habeee verloooren!")
        }
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
