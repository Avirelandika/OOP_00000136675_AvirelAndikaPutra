package oop_00000136675_AvirelAndikaPutra.week04

open class Vehicle (val brand: string) {
    var speed: int = 0
    open fun accelerate() {
        speed += 10
        peintln("$brand melaju. kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("Beep beep!")
    }
}