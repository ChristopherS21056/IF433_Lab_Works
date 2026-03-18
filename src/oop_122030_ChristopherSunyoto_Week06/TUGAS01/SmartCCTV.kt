package oop_122030_ChristopherSunyoto_Week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV [$name] (ID: $id) AKTIF.")
        // Sesuai instruksi: Memanggil startRecord() secara otomatis saat dinyalakan
        startRecord()
    }

    override fun turnOff() {
        stopRecord()
        println("CCTV [$name] SELESAI. Sistem keamanan nonaktif.")
    }

    override fun startRecord() {
        println("[$name]: Sensor gerak aktif. Memulai perekaman video...")
    }
    }