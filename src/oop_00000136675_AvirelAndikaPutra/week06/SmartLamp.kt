package oop_00000136675_AvirelAndikaPutra.week05

// File: SmartLamp.kt
class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() { println("[$name] Lampu dinyalakan.") }
    override fun turnOff() { println("[$name] Lampu dimatikan.") }
}