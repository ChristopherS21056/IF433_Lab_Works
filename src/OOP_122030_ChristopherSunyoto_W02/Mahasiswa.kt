package oop_122030_ChristopherSunyoto.week02

class Mahasiswa(val name: String,
                val nim: String,
                var major: String,
                var gpa: Double = 0.0,  // <-- Default Argument
)
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
    // Secondary Constructor
    // Wajib memanggil Primary constructor menggunakan 'this()'
    constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated") {
        println("LOG: Menggunakan copnstructor jalur umum (Tanpa Jurusan).")
    }
}
