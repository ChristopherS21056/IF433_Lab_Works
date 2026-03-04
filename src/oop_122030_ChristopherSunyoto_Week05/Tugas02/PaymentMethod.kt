package oop_122030_ChristopherSunyoto_Week05

abstract class PaymentMethod(val accountName: String){
    abstract fun processPayment(amount: Double)
}