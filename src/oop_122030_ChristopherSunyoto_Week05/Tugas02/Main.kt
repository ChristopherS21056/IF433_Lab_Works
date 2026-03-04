package oop_122030_ChristopherSunyoto_Week05

fun main() {
    println("\n--- TUGAS 2: SISTEM PEMBAYARAN ---")

    val myEWallet = EWallet("Gopay Budi", 50000.0)
    val myCreditCard = CreditCard("BCA Budi", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    for (payment in paymentList) {
        println("\nMemproses tagihan 75000.0 untuk: ${payment.accountName}")
        payment.processPayment(75000.0)
    }
}