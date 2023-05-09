class Fireball:Attack("Fireball",40) {
    override fun use(target: Any) {

       if(target is Evildigimon) {
           target.hp -= power
           println("""  
               $name hat $power bei ${target.name} verursacht.
           """.trimIndent())
       }
    }



}