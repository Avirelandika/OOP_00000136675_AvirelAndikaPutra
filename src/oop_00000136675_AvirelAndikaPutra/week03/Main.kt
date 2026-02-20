package oop_00000136675_AvirelAndikaPutra.week03

fun main() {
    val e = Employee("Budi")

    println("--- Test Employee ---")
    e.salary = 5000000
    e.increasePerformance()
    e.printStatus()
    println("Pajak: ${e.tax}")

    println("\n=== TESTING WEAPON (TASK 1) ===")
    val mySword = Weapon("Excalibur")

    mySword.damage = -50

    mySword.damage = 9999

    println("Senjata: ${mySword.name} | Damage: ${mySword.damage} | Tier: ${mySword.tier}")


    println("\n=== TESTING PLAYER (TASK 2) ===")
    val p1 = Player("JohnThor")

    p1.addXp(50)
    println("Status: ${p1.username} | Level: ${p1.level}")

    p1.addXp(60)
    println("Status: ${p1.username} | Level: ${p1.level}")
}