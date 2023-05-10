


fun main(){
    var tasche = mutableListOf<Item>()

    var E1 = Egg("Ei",10)

    var card = DragonsBreath()

    tasche.add(card)





    var demidevimonsAttacken= mutableListOf<Attack>(Giftpfeile(),Gefluester())
    var devimonsAttacken= mutableListOf<Attack>(Todeskralle(),BoeseFluegel())

    var dorumonsAttacken = mutableListOf<Attack>(Fireball(),DinoTooth())
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


    var p1 = Player("Ermi",tasche,true)
    var p2 = Player("Kolon",tasche,true,d3)

    d1.evolve(p1,d2)


    p1.getEgg(E1)
    E1.getPet(p1)





}










fun battleSystem(p1:Player,boss:Evildigimon,d1:Digimon) {



    if(boss.spawn){

        boss.spawn()
        println("ruf dein digimon")
        p1.startBattle(d1)
        d1.useAttack(0,boss)
        boss.showHp()
        boss.bossAttack(0,d1)
        d1.showHp()








    }

}
