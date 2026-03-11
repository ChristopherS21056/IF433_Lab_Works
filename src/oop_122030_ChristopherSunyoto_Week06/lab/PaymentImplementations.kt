package oop_122030_ChristopherSunyoto_Week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing $amount via Gopay Server")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Contacting Bank for Rp$amount")
    }
}