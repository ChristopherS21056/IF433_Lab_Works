package oop_122030_ChristopherSunyoto_Week08.TUGAS

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai safe calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ? : "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt  = validOrder.totalPrice?.let { price ->
        // Blok ini Hanya jika totalPrice tidak null
        val tax = price * 0.11
        "Transaksi Valid. Harga: nRp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)
}