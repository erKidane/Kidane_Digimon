package alleAttacken
import Evildigimon

class HolySword:Attack("Holy Sword",300) {

    override fun use(target: Any) {

        if(target is Evildigimon) {
            target.hp -= power
            println("""  
               $name hat $power schaden bei ${target.name} verursacht.
           """.trimIndent())
        }
    }
}
