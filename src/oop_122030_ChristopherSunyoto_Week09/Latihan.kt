package oop_122030_ChristopherSunyoto_Week09

fun main() {
    println("========= LIST OF =========")
    var arSiswa = listOf("Budi", "Danu", "Susi", "Cica")
    // View
    println(arSiswa) // object -> array
    // Panjang Array
    println("Banyak siswa: " + arSiswa.size)
    // Munculin satu orang aja
    println("Siswa bernama ${arSiswa[1]}")
    // Munculin semua orang ---> for-each
    for(a in arSiswa) {
        print("Siswa " + a + " dan ")
    }

    println("======= LIST OF MUTABLE =======")
    var arMatkul = mutableListOf("OOP", "Pemweb", "Matdis", "Kalkulus")
    arMatkul.add("Algo")
    arMatkul[2] = "Aljabar linear"
    arMatkul.remove("Pemweb")
    println(arMatkul)

    println("======= SET OF IMUT ========")
    var arNilai = setOf(80, 90, 75, 90, 98, 77, 54, 74)
    println("banyak nilai : ${arNilai.size}")
    println("ada angka 90 gak? ${arNilai.contains(90)}")
    println(arNilai)

    println("======= SET OF MUTABLE ========")
    val arMahasiswa = mutableSetOf("Andi", "Yanto","Udin", "Yuda")
    arMahasiswa.add("Yanti")
    arMahasiswa.add("Udin")
    println(arMahasiswa)
}