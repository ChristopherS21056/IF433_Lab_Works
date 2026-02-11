package oop_122030_ChristopherSunyoto.week02

class Pemain {
    var nama:String = "tidak terdaftar"
    var speed:Int = 9   //val itu menetrapkan nilai, kalau var itu bergantung pada yang ditetapkan dibawah
    val shoot: Int = 8

    init {      //primary constructor-- Selalu awal dibaca walau constructor berada diawal sebelum init
        nama = "Messi"
        println("Ini adalah constructor $nama")
    }

    constructor(alias: String="Budi", kecepatan: Int=2) {   //Secondary constructor -- ada syntax seperti sring, int dll
        // t
        nama  = alias
        speed = kecepatan
        println("Ini constructor kedua")
    }

    fun bawa_bola(){
        println("si $nama sedang bawa bola")
    }
}

fun main() {
    val player = Pemain(alias = "Yoel", kecepatan = 100) //buat objek baru, disimpan ke dalam variabel baru
    player.bawa_bola()
    println("nama pemain:${player.nama}")
    println("Skill kecepatan: " + player.speed)

    val player2 = Pemain(alias="Ronaldo", kecepatan = 99)
    println("pemain Populer: {$player2.nama}")
    println("Kecepatan: " + player2.speed)
}