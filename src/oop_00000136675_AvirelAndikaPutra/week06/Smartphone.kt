package oop_00000136675_AvirelAndikaPutra.week05

// File: Smartphone.kt
class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn() // Menjalankan logika Camera
        super<Phone>.turnOn()  // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}