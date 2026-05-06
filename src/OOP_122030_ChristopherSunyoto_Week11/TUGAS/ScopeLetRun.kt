package oop_122030_ChristopherSunyoto_Week11.TUGAS

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length // return value
    }
    println("Panjang nama: $length")
}