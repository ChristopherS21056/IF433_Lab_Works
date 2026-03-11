package oop_122030_ChristopherSunyoto_Week06

fun main() {
    val mhs = Mahasiswa(
        namaOrg = "MisterMiss UMN 2026",
        budgetRapat = 250000,
        jmlOrg = 200,
        namaMk = "OOP",
        nilaiMk = 89
    )
    mhs.rapat()
    mhs.penilaian()
    mhs.keaktifan()
}