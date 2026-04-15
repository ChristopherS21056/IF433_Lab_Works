package oop_122030_ChristopherSunyoto_week07.oop_122030_ChristopherSunyoto_week07_TUGAS.Mandiri

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}

fun main() {
    GameManager.startGame()
    GameManager.startGame()
}