package oop_00000136675_AvirelAndikaPutra.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = vehicle( brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalvehicle.accelerate()

    println("\n--- Testing Car ---")
    val mycar = Car(brand = "Toyota", numberofdoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myEV = ElectricCar("Tesla", 2, 85)
    myEV.accelerate()
    myEV.honk()
    myEV.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager("Budi", 8000000)
    val developer = Developer("Aris", 7000000, "Kotlin")

    manager.work()
    println("Bonus ${manager.name}: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus ${developer.name}: Rp ${developer.calculateBonus()}")
}