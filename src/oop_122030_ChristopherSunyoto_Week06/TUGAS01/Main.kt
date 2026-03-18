package oop_122030_ChristopherSunyoto_Week06

fun main() {
    val myHomeHub = SmartHomeHub()

    val lampuTamu = SmartLamp(id = "L001", name = "Ruang Tamu")
    val speakerDapur = SmartSpeaker(id = "S001", name = "Google Nest Dapur")
    val cctvGarasi = SmartCCTV(id = "C001", name = "Ezviz Garasi")

    println("--- Inisialisasi Sistem ---")
    myHomeHub.addDevice(lampuTamu)
    myHomeHub.addDevice(speakerDapur)
    myHomeHub.addDevice(cctvGarasi)

    println("\n--- Operasi Mandiri ---")
    lampuTamu.turnOn()
    speakerDapur.turnOn()
    speakerDapur.playMusic("Bohemian Rhapsody")
    cctvGarasi.turnOn()

    myHomeHub.activateSecurityMode()
    myHomeHub.turnOffAllSwitches()

    println("Simulasi Smart Home selesai.")
}