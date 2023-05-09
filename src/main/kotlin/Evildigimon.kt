class Evildigimon (
    var hp:Int,
    var name:String,
    var stufe:DigiLevels,
    var spawn:Boolean,
    var attacken:MutableList<Attack>,
    var lootItems:MutableList<Item>
) {

    fun spawn() {
        println("$name is spawned!")
    }

    fun despawn() {
        var spawnTime = 300
        do {
            if (spawn) {
                spawnTime--

            }
        }while (spawnTime < 0)
    }

    fun loot(spieler:Player) {
        if(this.hp == 0) {
            lootItems.removeAll(lootItems)
            spieler.inventar.addAll(lootItems)
        }
    }

    fun bossAttack(index:Int,target:Digimon){
        val attack = attacken[index]
        attack.use(target)
    }

    fun showHp() {
        println("$name hat $hp HP!")
    }

    fun evilEvolve() {
        if(hp <= 50 ){
        when (this.stufe) {
            DigiLevels.Baby -> {
                this.stufe = DigiLevels.Rookie
                this.hp + 50
            }

            DigiLevels.Rookie -> {
                this.stufe = DigiLevels.Champion
                this.hp + 100
            }

            DigiLevels.Champion -> {
                this.stufe = DigiLevels.Ultra
                this.hp + 150
            }

            else -> {}
        }

        }

    }



}
