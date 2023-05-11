import alleAttacken.*



fun main(){
    var tasche = mutableListOf<Item>()

    var E1 = Egg("Ei",10)

    var card = DragonsBreath()

    tasche.add(card)





    var demidevimonsAttacken= mutableListOf<Attack>(Giftpfeile(), Gefluester())
    var devimonsAttacken= mutableListOf<Attack>(Todeskralle(), BoeseFluegel())

    var dorumonsAttacken = mutableListOf<Attack>(Fireball(), DinoTooth())
    var reptildramonsAttacken = mutableListOf<Attack>()
    var grademonsAttacken = mutableListOf<Attack>()
    var alphamonsAttacken = mutableListOf<Attack>()

    var itemLoot = mutableListOf<Item>()

    var boss = Evildigimon(100,"Demidevimon",DigiLevels.Rookie,true,demidevimonsAttacken,itemLoot)
    var boss2 = Evildigimon(400,"Devimon",DigiLevels.Champion,true,dorumonsAttacken,itemLoot)


    var d1 = Digimon(100,"Dorumon",DigiLevels.Rookie,dorumonsAttacken)
    var d2 = Digimon(150,"Reptiledramon",DigiLevels.Champion,reptildramonsAttacken)
    var d3 = Digimon(200,"Grademon",DigiLevels.Ultra,grademonsAttacken)
    var d4 = Digimon(250,"Alphamon",DigiLevels.Mega,alphamonsAttacken)


    var p1 = Player("Gordon",tasche,true)
    var p2 = Player("Kolon",tasche,true,d3)



battleSystem(p1,boss,d1,boss2,d4)






}





fun battleSystem(p1:Player,boss:Evildigimon,d1:Digimon,boss2:Evildigimon,d4:Digimon) {



    if (boss.spawn) {



        println("ruf dein digimon")

        Thread.sleep(2000)

        p1.startBattle(d1)

        Thread.sleep(2000)

        println("Welche attacke soll dein ${d1.name} benutzen?")

        Thread.sleep(2000)

        println("${d1.name} beherrscht ${d1.attacken.first()} & ${d1.attacken.last()}")

        Thread.sleep(2000)

        println("mit 0 wählst du die erste Attacke aus und mit 1 die zweite.")

        Thread.sleep(2000)

        var attckenEingabe1 = readln().toInt()

        Thread.sleep(2000)

        d1.useAttack(attckenEingabe1, boss)

        Thread.sleep(2000)


        boss.showHp()

        Thread.sleep(2000)

        println("${boss.name}: war das schon alles?!")

        Thread.sleep(2000)

        println("${boss.name} holt aus für den Gegenangriff!")

        Thread.sleep(2000)

        var bossIndexAttacken = listOf(0, 1).random()

        Thread.sleep(2000)

        boss.bossAttack(bossIndexAttacken, d1)

        Thread.sleep(2000)

        d1.showHp()

        Thread.sleep(2000)

        println("${d1.name}: wartet auf ein befehl von dir ${p1.name}!")

        Thread.sleep(2000)

        println("Welche attacke soll dein ${d1.name} benutzen?")

        Thread.sleep(2000)

        println(" ${d1.attacken[0]} oder ${d1.attacken[1]}")

        Thread.sleep(2000)

        var attckenEingabe2 = readln().toInt()

        Thread.sleep(2000)

        d1.useAttack(attckenEingabe2, boss)

        Thread.sleep(2000)

        println("${p1.name}: gut gemacht ${d1.name}!")

        Thread.sleep(2000)

        boss.showHp()

        Thread.sleep(2000)

        println("${boss.name}: wie kannst du es wagen mich anzugreifen!!!")

        Thread.sleep(2000)

        println("${boss.name} hüllt sich mit einer finsteren Energie!")

        Thread.sleep(2000)

        boss.evilEvolve(boss2)

        Thread.sleep(2000)

        println("${boss2.name}: Du wirst es bereuen dich mit mir angelegt zu haben!!")

        Thread.sleep(2000)

        boss2.bossAttack(bossIndexAttacken, d1)

        Thread.sleep(2000)

        d1.showHp()

        Thread.sleep(2000)

        println("${d1.name} kann noch kaum stehen!")

        Thread.sleep(2000)

        d1.powerOfFriendschip(p1,d1,d4)

        Thread.sleep(2000)

        println("${p1.name}: lass uns gemeinsam angreifen ${d4.name}")

        Thread.sleep(2000)

        println(d4.attacken)

        Thread.sleep(2000)

        println("welche attacke möchstest du einsetzen!?")

        Thread.sleep(2000)

        var attackenEingabe3 = readln().toInt()

        Thread.sleep(2000)

        d4.useAttack(attackenEingabe3,boss2)

        boss2.showHp()






    }else
        println("es ist kein böses Digimon erschienen.")


}




