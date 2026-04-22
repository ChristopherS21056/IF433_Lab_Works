package oop_122030_ChristopherSunyoto_Week09.TUGAS

fun main() {
    println("=== TEST LAMBDA ===")
    //Syntax lambda eksplisit: {parameters -> body }
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5, 10)}")

    // LAMDA dengan satu parameter bisa menggunakan implicit "it"
    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}