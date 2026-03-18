package oop_122030_ChristopherSunyoto_Week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu [$name] dengan ID: $id sekarang MENYALA.")
    }

    override fun turnOff() {
        println("Lampu [$name] dengan ID: $id sekarang MATI.")
    }
}