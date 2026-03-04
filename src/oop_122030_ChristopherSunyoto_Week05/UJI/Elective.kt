package oop_122030_ChristopherSunyoto_Week05.UJI

class Elective : Matakuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "VR Programming"
        println("Efektif ${super.nama} sks $sks")
    }
    fun ada_praktek() {
        println("Wajib di praktekin")
    }
}