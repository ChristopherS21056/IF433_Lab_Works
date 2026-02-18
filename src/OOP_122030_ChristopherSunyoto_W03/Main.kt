package oop_122030_ChristopherSunyoto.week03

fun main() {
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000 //  Harusnya print Error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //2. Test encapsulation
    e.increasePerformance()
    // e.performanceRating = 5 // coba uncomment, pasti merah (Error)

    // 3. Test computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}