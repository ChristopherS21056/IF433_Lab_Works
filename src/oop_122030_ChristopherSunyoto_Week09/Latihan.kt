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
}