package oop_122030_ChristopherSunyoto_Week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Sistem: Berhasil mendaftarkan [${device.name}] ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Menjalankan Protokol: Matikan Semua Saklar ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            } else {
                println("Sistem: [${device.name}] bukan perangkat Switchable, dilewati.")
            }
        }
        println("--- Protokol Selesai ---\n")
    }
}