package oop_122030_ChristopherSunyoto.week02

class Mahasiswa(val name: String, val nim: String, val major: String)
{
    init {
        // Validasi sederhana: Cek Panjang NIM
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di memory.")
        }
    }
}
