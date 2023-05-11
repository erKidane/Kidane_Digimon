import alleAttacken.*


fun main(){
    var bag = mutableListOf<Item>()

    var p1 = Player("TK",bag, false)

    var demidevimonsAttacken = mutableListOf<Attack>(Giftpfeile(), Gefluester())
    var devimonsAttacken= mutableListOf<Attack>(Todeskralle(), BoeseFluegel())
    var deviBag = mutableListOf<Item>()
    var dorumonsAttacken = mutableListOf<Attack>(Fireball(), DinoTooth())
    var alphamonsAttacken = mutableListOf<Attack>(DigitizeofSoul(),HolySword())

    var demideviBag = mutableListOf<Item>()

    var boss = Evildigimon(110,"Demidevimon",DigiLevels.Rookie,true,demidevimonsAttacken,demideviBag)
    var boss2 = Evildigimon(400,"Devimon",DigiLevels.Champion,true,devimonsAttacken,deviBag)
    var d1 = Digimon(100,"Dorumon",DigiLevels.Rookie,dorumonsAttacken)
    var d4 = Digimon(250,"Alphamon",DigiLevels.Mega,alphamonsAttacken)


    var fight = Battlesystem(p1,d1,boss,boss2,d4)

    fight.startBattle()

}