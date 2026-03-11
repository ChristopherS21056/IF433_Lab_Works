import oop_122030_ChristopherSunyoto_Week06.CreditCard
import oop_122030_ChristopherSunyoto_Week06.PaymentMethod

// Fungsi ini decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai Checkout...")
    method.pay(amount) // Dynamic Polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.tunOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n === TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}