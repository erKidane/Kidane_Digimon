package alleAttacken

import Evildigimon

open class DinoTooth: Attack("Dino Tooth",50) {

    override fun use(target: Any) {

        if (target is Evildigimon) {
            target.hp -= power
            println(
                """  
               $name hat $power schade bei ${target.name} verursacht.
           """.trimIndent()
            )
        }
    }
}