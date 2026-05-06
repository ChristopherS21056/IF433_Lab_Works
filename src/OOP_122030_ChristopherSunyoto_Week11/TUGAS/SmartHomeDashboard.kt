package oop_122030_ChristopherSunyoto_Week11.TUGAS

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    homeDevices.add(
        SmartDevice("Philips WiZ Living Room", "Lighting").apply {
            isOnline = true
            powerLoad = 12
        }
    )
}