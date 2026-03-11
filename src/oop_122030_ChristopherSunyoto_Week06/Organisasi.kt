package oop_122030_ChristopherSunyoto_Week06

interface Organisasi {
    val namaOrg: String
    val budgetRapat: Int
    val jmlOrg: Int
    val biayaKonsumsi: Int
        get() = budgetRapat * jmlOrg

    fun rapat() {
        println("Lintang Balakosa Ganteng bingitsss...")
    }
    fun keaktifan() {
        println("Ih kamu aktiff lohhh...")
    }
}