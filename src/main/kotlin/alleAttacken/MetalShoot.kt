package alleAttacken

import Evildigimon

class MetalShoot : Attack("Metal Shoot",10) {
    override fun use(target: Any) {

        if(target is Evildigimon) {
            repeat(5) {
                target.hp -= power
            }

            println("""  
               $name hat $power schaden bei ${target.name} verursacht.
           """.trimIndent())
        }
    }


}