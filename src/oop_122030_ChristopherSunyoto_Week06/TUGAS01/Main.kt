package oop_122030_ChristopherSunyoto_Week06

fun main() {
    val hub = SmartHomeHub()

    val lampuTamu = SmartLamp(id = "L-01", name = "Ruang Tamu")
    val googleNest = SmartSpeaker(id = "S-02", name = "Google Nest Dapur")
    val ezvizCCTV = SmartCCTV(id = "C-03", name = "Ezviz Garasi")

    println("=== PROSES REGISTRASI PERANGKAT ===")
    hub.addDevice(lampuTamu)
    hub.addDevice(googleNest)
    hub.addDevice(ezvizCCTV)
    println("===================================\n")

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}