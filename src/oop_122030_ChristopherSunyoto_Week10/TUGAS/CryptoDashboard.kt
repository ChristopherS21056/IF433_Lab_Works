package oop_122030_ChristopherSunyoto_Week10.TUGAS

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 10.2))
    coinRepo.add(Coin("USDT", 5000.0))

    println("Isi Dompet: ${coinRepo.getAll()}")

}
