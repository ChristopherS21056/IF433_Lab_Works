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

    println("========= MAP IMUT ========")
    val arResto = mapOf(
        "Ayam" to 5000,
        "Bakpao" to 3000,
        "Sayur Asem" to 2500
    )
    println("Banyak Menu ${arResto.size}")
    println("Harga Ayam ${arResto["Ayam"]}")
    println("List Makanan ${arResto.keys}")
    println("List Harga ${arResto.values}")
    println(arResto)

    println("====== MAP MUTABLE =======")
    val arKHS = mutableMapOf(
        "Toni" to 80,
        "Luffy" to 85,
        "Zoro" to 87,
        "Nami" to 90
    )
    arKHS.remove("Toni")
    arKHS["Luffy"] = 92
    arKHS["Zoro"] = 97
    println(arKHS)

    println("========= LAMBDA =========")
    // FUNCTION BIASA
    fun tambah(a: Int, b: Int): Int {
        return  a + b
    }
    println("Hasil penambahan ${tambah(5, 3)}")

    // function lambda  -> tulisnya kesamping atau horizontal
    val kurang = {a: Int, b:Int -> a-b}
    println("Hasil pengurangan ${kurang (5, 3)}")

    println("======= LAMBDA {IT} ========")
    val pangkat = {a:Int -> a*a}
    val hasilPangkat: (Int)-> Int = {it * it}
    println("Hasil Pangkat ${hasilPangkat(5)}")

    println("======= FOREACH BIASA ========")
    for (a in arMatkul) {
        println(a)
    }
    println("======= FOREACH IT ========")
    arMatkul.forEach {
        println(it)
    }

    println("======= FOREACH VARIABLE ========")
    arMatkul.forEach { mk ->
        println(mk)
    }

}