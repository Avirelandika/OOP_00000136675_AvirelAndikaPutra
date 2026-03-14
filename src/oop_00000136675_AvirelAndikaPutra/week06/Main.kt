package oop_00000136675_AvirelAndikaPutra.week05

// File: Main.kt
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    println("\n=== TESTING SMART HOME SYSTEM ===")
    val hub = SmartHomeHub()

    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("--- Mengaktifkan Mode Keamanan ---")
    hub.activateSecurityMode()

    println("\n--- Mematikan Semua Perangkat ---")
    hub.turnOffAllSwitches()
}