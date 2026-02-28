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
}