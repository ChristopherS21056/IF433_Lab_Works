package oop_122030_ChristopherSunyoto_Week10.TUGAS

class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}
