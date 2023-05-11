package alleAttacken

import Digimon

class Todeskralle: Attack("Todeskralle",60) {
    override fun use(target: Any) {
        if (target is Digimon) {

            target.hp -= power
            println("$name schaden hat $power bei ${target.name} verursacht.")
        }
    }
}