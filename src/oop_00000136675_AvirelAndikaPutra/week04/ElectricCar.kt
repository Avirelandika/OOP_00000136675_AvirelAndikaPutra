package oop_00000136675_AvirelAndikaPutra.week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {

    // Gunakan 'final' agar tidak bisa di-override lagi oleh keturunan berikutnya
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}