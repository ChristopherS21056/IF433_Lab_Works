package oop_122030_ChristopherSunyoto_week07_TUGAS

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}