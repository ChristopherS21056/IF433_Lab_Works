package oop_122030_ChristopherSunyoto_Week11.TUGAS

data class User(var name: String = "", var age: Int = 0)

fun main() {
    // TEST APPLY
    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)