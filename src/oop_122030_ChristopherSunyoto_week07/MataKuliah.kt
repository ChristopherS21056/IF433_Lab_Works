package oop_122030_ChristopherSunyoto_week07

enum class MataKuliah(val jmlsks: Int) {
    OOP(3),
    GAMEDEV(4),
    DASPRO(2);

    fun sks_matkul() {
        println("Juumlah SKS nya: $jmlsks")
    }
}