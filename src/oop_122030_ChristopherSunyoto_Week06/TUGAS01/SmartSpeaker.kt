package oop_122030_ChristopherSunyoto_Week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Speaker [$name] AKTIF. Siap menerima perintah suara.")
    }

    override fun turnOff() {
        println("Smart Speaker [$name] NONAKTIF. Sampai jumpa!")
    }

    fun playMusic(song: String) {
        println("[$name] Memutar lagu $song dari Spotify.")
    }
}