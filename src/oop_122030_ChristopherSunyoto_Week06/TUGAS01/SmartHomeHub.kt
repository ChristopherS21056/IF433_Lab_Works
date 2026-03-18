package oop_122030_ChristopherSunyoto_Week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Sistem: Berhasil mendaftarkan [${device.name}] ke Hub.")
    }

    fun activateSecurityMode() {
        println("\n=== MENGAKTIFKAN MODE KEAMANAN ===")
        for (device in devices) {

            if (device is Recordable) {
                device.startRecord()
            }

            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
        println("=== MODE KEAMANAN AKTIF ===\n")
    }

    fun turnOffAllSwitches() {
        println("\n--- Menjalankan Protokol: Matikan Semua Saklar ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
        println("--- Protokol Selesai ---\n")
    }
}