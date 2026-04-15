package oop_122030_ChristopherSunyoto_Week08.TUGAS

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai safe calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ? : "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}