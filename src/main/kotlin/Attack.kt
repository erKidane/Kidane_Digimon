open class Attack(
    var name:String,
    var power: Int
) {
    open fun use(target:Any){
        println("wurd nicht geändert.")
    }

}