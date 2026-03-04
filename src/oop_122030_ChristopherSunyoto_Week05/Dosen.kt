package oop_122030_ChristopherSunyoto_Week05

class Dosen (nama: String, val nidn: String) : Pegawai(nama) {
    // WAJIB di override karena fungsi bekerja() bersifat abstract di parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    // FUNGSI unik atau spesifik yang hanya dimiliki dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}