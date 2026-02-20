package oop_00000136675_AvirelAndikaPutra.week03

fun main() {
    val e = Employee("Budi")

    println("--- Test Validasi Salary ---")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    e.printStatus()

    println("Pajak yang harus dibayar: ${e.tax}")


    println("\n=== TESTING WEAPON (TASK 1) ===")

    val mySword = Weapon("Excalibur")

    println("Action: Set damage ke -50")
    mySword.damage = -50

    println("Action: Set damage ke 9999")
    mySword.damage = 9999

    println("Hasil Akhir -> Nama: ${mySword.name} | Damage: ${mySword.damage} | Tier: ${mySword.tier}")
}