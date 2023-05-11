package alleAttacken

import Evildigimon

class Fireball: Attack("Fireball",50) {
    override fun use(target: Any) {

       if(target is Evildigimon) {
           target.hp -= power
           println("""  
               $name hat $power schaden bei ${target.name} verursacht.
           """.trimIndent())
       }
    }



}