package alleAttacken
import Evildigimon

class DigitizeofSoul:Attack("Digitize of Soul",150) {

    override fun use(target: Any) {

        if(target is Evildigimon) {
            target.hp -= power
            println("""  
               $name hat $power schaden bei ${target.name} verursacht.
           """.trimIndent())
        }
    }
}