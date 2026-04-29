package oop_122030_ChristopherSunyoto_Week10.TUGAS

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 10.2))
    coinRepo.add(Coin("USDT", 5000.0))

    println("Isi Dompet: ${coinRepo.getAll()}")

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.1))
    txRepo.add(Transaction("TX002", 50.0))

    println("\nRiwayat Transaksi:")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id}, Amount: ${tx.amount}")
    }

}
