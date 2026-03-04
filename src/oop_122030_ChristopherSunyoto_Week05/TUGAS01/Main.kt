package oop_122030_ChristopherSunyoto_Week05

fun main() {
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(10, 4)
    println("Luas Persegi Panjang (10x4): $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(10.0)
    println("Luas Lingkaran (jari-jari 10.0): $luasLingkaran")
}