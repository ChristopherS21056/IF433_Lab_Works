package oop_122030_ChristopherSunyoto_Week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Sukses! Pembayaran e-wallet berhasil. Sisa saldo: $balance")
        } else {
            println("[$accountName] Gagal: Mohon Maaf, Saldo anda tidak cukup. (Saldo: $balance, Tagihan: $amount)")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top-up sebesar $amount berhasil. Saldo sekarang: $balance")
    }
}