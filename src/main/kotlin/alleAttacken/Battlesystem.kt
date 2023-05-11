package alleAttacken
import Digimon
import Evildigimon
import Player


open class Battlesystem(var p1:Player, var digimon:Digimon, var boss:Evildigimon, var evolvedBoss:Evildigimon, var evolvedDigimon:Digimon) {



    fun startBattle(){

        if(boss.spawn) {
            println("Ein wildes ${boss.name} ist aufgetaucht!!")
            p1.startBattle(digimon)
            while (boss.hp > 0){
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
                if (boss.hp <= 20) {
                    boss.evilEvolve(evolvedBoss)
                    boss = evolvedBoss
                }
                if(digimon.hp <= 20) {
                    digimon.powerOfFriendschip(p1, digimon, evolvedDigimon)
                    digimon = evolvedDigimon
                }



            }
        }else{
            println("kein böses Digimon gespawnt.")
        }



    }
}