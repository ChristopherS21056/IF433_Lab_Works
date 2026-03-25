package oop_122030_ChristopherSunyoto_week07_TUGAS

fun main () {
    println("=== TEST SINGLETONB ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat factory
    client.connect()
}