package oop_122030_ChristopherSunyoto_Week09.TUGAS

fun main() {
    println("=== TEST LIST ===")
    // Immutable List : Tidak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    // Frameworks.add("Python") // Uncomment Ini akan Error!
    println("Immutable List: $frameworks")

    // Mutable List: Bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}