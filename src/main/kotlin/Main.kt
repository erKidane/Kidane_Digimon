import alleAttacken.*


fun main(){
    var bag = mutableListOf<Item>()

    var p1 = Player("Gordon",bag, false)

    var demidevimonsAttacken = mutableListOf<Attack>(Giftpfeile(), Gefluester())
    var dorumonsAttacken = mutableListOf<Attack>(Fireball(), DinoTooth())

    var bossBag = mutableListOf<Item>()

    var boss = Evildigimon(100,"Demidevimon",DigiLevels.Rookie,true,demidevimonsAttacken,bossBag)
    var d1 = Digimon(100,"Dorumon",DigiLevels.Rookie,dorumonsAttacken)

    var fight = Battlesystem(p1,d1,boss)

    fight.startBattle()

}