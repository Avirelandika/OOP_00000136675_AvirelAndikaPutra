package oop_00000136675_AvirelAndikaPutra.week05

// File: SmartSpeaker.kt
class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() { println("[$name] Speaker standby...") }
    override fun turnOff() { println("[$name] Speaker dimatikan.") }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}