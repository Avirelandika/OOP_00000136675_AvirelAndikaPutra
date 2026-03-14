package oop_00000136675_AvirelAndikaPutra.week05

// File: SmartCCTV.kt
class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("[$name] Kamera aktif.")
        startRecord()
    }
    override fun turnOff() { println("[$name] Kamera non-aktif.") }
    override fun startRecord() { println("[$name] Mulai merekam video...") }
}