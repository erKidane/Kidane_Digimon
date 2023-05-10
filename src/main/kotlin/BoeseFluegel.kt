class BoeseFluegel:Attack("BoeseFluegel",80) {
    override fun use(target: Any) {
        if (target is Digimon) {

            target.hp -= power
            println("$name hat $power bei ${target.name} verursacht.")
        }
    }
}