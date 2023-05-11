package alleAttacken

import Digimon

class Gefluester: Attack("Gefluester",40) {
    override fun use(target: Any) {
        if (target is Digimon) {

            target.hp -= power
            println("$name hat $power schaden bei ${target.name} verursacht.")
        }
    }
}