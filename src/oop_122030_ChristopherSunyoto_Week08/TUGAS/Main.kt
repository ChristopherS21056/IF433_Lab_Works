package oop_122030_ChristopherSunyoto_Week08.TUGAS

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai safe calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt  = validOrder.totalPrice?.let { price ->
        // Blok ini Hanya jika totalPrice tidak null
        val tax = price * 0.11
        "Transaksi Valid. Harga: nRp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"
    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )
    for (item in mixedData) {
        val text = item as? String

        // Hanya cetak jika cast sukses (text tidak null)
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }
    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast fallback: $safeString")
    // HASIL OUTPUT : === TEST SAFE CALLS & ELVIS ===
    //Tujuan pengiriman: Kota Tidak Diketahui
    //
    //=== TEST LET BLOCK ===
    //Transaksi Valid. Harga: nRp250000, Pajak: Rp27500.0
    //
    //=== TEST SAFE CASTING ===
    //Ditemukan teks: SMARTPHONE
    //Ditemukan teks: LAPTOP
    //Hasil cast fallback: Unknown String
}