package oop_122030_ChristopherSunyoto_week07_TUGAS

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connection to Server"
        println("Database is ready.")
    }
}