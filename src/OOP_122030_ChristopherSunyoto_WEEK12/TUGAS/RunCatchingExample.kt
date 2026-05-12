package oop_122030_ChristopherSunyoto_WEEK12.TUGAS

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}