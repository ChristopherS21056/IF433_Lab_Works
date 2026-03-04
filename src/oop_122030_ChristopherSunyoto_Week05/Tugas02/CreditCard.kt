package oop_122030_ChristopherSunyoto_Week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Sukses! Pembayaran kartu kredit berhasil. Limit terpakai: $usedAmount / $limit")
        } else {
            println("[$accountName] Gagal: Transaksi ditolak karena melebihi limit.")
        }
    }
}