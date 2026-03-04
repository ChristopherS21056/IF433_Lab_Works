package  oop_122030_ChristopherSunyoto_Week05

class Admin(nama: String) : Pegawai (nama) {
    override fun bekerja () {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    // FUNGSI Unik atau spesifik yang hanya dimiliki oleh admin
    fun doAdminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}