class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damageif (hp < 0) hp = 0
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}