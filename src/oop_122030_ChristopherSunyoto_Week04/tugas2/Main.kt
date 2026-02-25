package oop_122030_ChristopherSunyoto_Week04.tugas2

fun main() {
    val manager = Manager("Christopher", 8000000)
    val developer = Developer("Vassel", 7000000, "Kotlin")
    manager.work()

    println("Bonus Manager: ${manager.calculateBonus()}")
    println()

    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")
}