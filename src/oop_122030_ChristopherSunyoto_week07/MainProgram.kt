package oop_122030_ChristopherSunyoto_week07

fun main() {
    // Koneksi.linkServer = "awjkdnawdklamnwdokl" // pengen diubah berdasar main program, jadi harus menjadi var pada koneksi.kt
    println("server: ${Koneksi.linkServer}")
    Koneksi.test_koneksi()

    Mahasiswa.nama="Varencia Lawrensio Sitompul"
    val na: Int = Mahasiswa.set_nilai(80, 100)
    println("Nilai ${Mahasiswa.nama} adalah $na")

    Mahasiswa.isi_nama_kampus("Institut Teknologi 10 November")

    val dsn1 = Dosen("Andhika Aryawian", "1254856", 2010)
    println(dsn1)
    val dsn2 = Dosen("Andreksiana", "149185", 2017)
    println(dsn2)

    // Cara ambil data satu per satu field aja
    println("Nama Dosen1: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}")


    println("Matkul favorit saya: ${MataKuliah.OOP.name}")
    println("Index Matkul: ${MataKuliah.OOP.ordinal}")
    MataKuliah.OOP.sks_matkul()

    for (matkul in MataKuliah.entries) {
        println("Matkul: $matkul")
        matkul.sks_matkul()
    }
}





