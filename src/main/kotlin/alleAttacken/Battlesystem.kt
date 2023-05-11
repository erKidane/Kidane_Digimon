package alleAttacken
import Digimon
import Evildigimon
import Player
import Item


open class Battlesystem(var p1:Player, var digimon:Digimon, var boss:Evildigimon ) {



    fun startBattle(){

        if(boss.spawn) {
            println("Ein wildes ${boss.name} ist aufgetaucht!!")
            p1.startBattle(digimon)
            do {
                println("Welche attacke soll dein ${digimon.name} benutzen?")
                Thread.sleep(1000)
                println("${digimon.name} beherrscht ${digimon.attacken.first()} & ${digimon.attacken.last()}")
                Thread.sleep(1000)
                println("mit 0 wählst du die erste Attacke aus und mit 1 die zweite.")
                var eingabe = readln().toInt()
                digimon.useAttack(eingabe, boss)
                Thread.sleep(1000)
                boss.showHp()
                Thread.sleep(1000)
                var bossIndexAttacken = listOf(0, 1).random()
                Thread.sleep(1000)
                boss.bossAttack(bossIndexAttacken, digimon)
                digimon.showHp()


            } while (boss.hp < 0)
        }else{
            println("kein böses Digimon gespawnt.")
        }



    }
}