package oop_00000136675_AvirelAndikaPutra.week05

// File: Clickable.kt
interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol_Rahasia"

    fun click()
}