package oop_122030_ChristopherSunyoto_Week05.UJI

class Wajib: Matakuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "OOP"
        println("Matkul ${super.nama} sks $sks")
    }
    fun ada_seminar() {
        println("Wajib ada seminar")
    }
}