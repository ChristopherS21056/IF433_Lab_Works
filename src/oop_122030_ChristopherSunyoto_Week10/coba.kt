package oop_122030_ChristopherSunyoto_Week10

// code non generic
class rumah(val alamat: Any)

// Code generic
class kampus<T>(val alamat: T)

// Code Generic - Multi parameter
class Komputer<T, V>(val merk: T , val barcode: V)

// Code generic - Function
fun <T> Password(isiPass:T): T {
    return isiPass
}

// Code Generic - function ada Constraint
class kalkulator<T:Number>(val a:T, val b:T) {
    fun tambah(): Int{
        return a.toInt() + b.toInt()
    }
    fun kurang(): Double{
        return a.toDouble() + b.toDouble()
    }
}

// Generic  - where
fun <T> penilaian(list: List<T>, kkm: T):List<T> where T: Comparable<T>{
    return list.filter {it >= kkm}
}

fun main () {
    println("===== GENERIC - WHERE =====")
    val daftarNilai = listOf(60, 71, 90, 83, 87, 55, 44, 89, 74, 68, 72)
    println("Daftar Nilai: " + daftarNilai)
    val nilaiAtasKKM = penilaian( daftarNilai, 70)
    println("Nilai diatas KKM: " + nilaiAtasKKM)

    println("===== GENERIC - CONSTRAINT =====")
    val kalk = kalkulator(10.13, 20.235)
    println("Penambahan ${kalk.a} ditambah ${kalk.b} : " + kalk.tambah())
    println("Pengurangan ${kalk.a} ditambah ${kalk.b} : " + kalk.kurang())

    println("==== GENERIC - FUNCTION ====")
    println("Password kamu: " + Password("12345"))

    println("===== GENERIC - MULTI PARAM =====")
    val komp = Komputer("Dell", 13212)
    println("Merk Komputer : " + komp.merk)
    println("Barcode Komputer:   ${komp.barcode}")

    println("===== SAMPLE NON GENERIC =====")
    val rmh = rumah(alamat = 200)
    val angkaRumah = rmh.alamat as Int
    println(angkaRumah + 50)

    println("===== SAMPLE GENERIC =====")
    val kmps = kampus(300)
    val angkaKampus = kmps.alamat as Int
    println(angkaKampus + 50)
}