package alleAttacken

import Digimon

open class Giftpfeile: Attack("Giftpfeile",20) {

     override fun use(target: Any){
         if(target is Digimon) {

             target.hp -= power
             println("$name hat $power schaden bei ${target.name} verursacht.")
         }
    }

}