package oop_00000136675_AvirelAndikaPutra.week05

// File: SmartHomeHub.kt
class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    // Task Checkpoint 18: Smart Casting
    fun activateSecurityMode() {
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}