package oop_122030_ChristopherSunyoto_Week11

// function biasa
fun panggil_nama (nama:String): String {
    return "Hai $nama"
}

// function extension - basic
fun String.panggil_mahasiswa(): String {
    // return "Hello $this"
    var hasil = this.split(" ").joinToString (" "){
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }
    return hasil
}
// Function extension - parameter
fun Int.tentukanLulus(nama: String):String {
    var keputusan = " "
    if(this >= 70) {
        keputusan = "Lulus"
    } else {
        keputusan = "Remedial"
    }
    return "Mahasiswa $nama hasil kelulusan adalah $keputusan"
}

// Function Extension- cek NULL
fun String?.cekNulldanEmpty():String {
    if(this == null || this.isEmpty()) {
        return "gak boleh null atau kosong bang"
    } else {
        return "username kamu adalah $this"
    }
}

class Mahasiswa () {
    var nim:String = ""
    var nama:String = ""
    var ipk:Int = 0
}
fun main() {
    // cara panggil function extension - NULL
    var inputUsername:String? = null
    println(inputUsername.cekNulldanEmpty())

    // Cara panggil function Extension - Parameter
    println(80.tentukanLulus("Revan"))

    // cara panggil function biasa
    println(panggil_nama("Toni").uppercase())

    // cara panggil function extension - BASIC
    println("tonyy stark iron man".panggil_mahasiswa()
    )

    // SCOPE - LET -> pakai it
    var kampusSaya = "UMN"
    kampusSaya.let {
        if (it == "UMN") {
            println("Saya berasal dari kampus " + it + "b aja")
        } else {
            println("Amazing $it")

        }
    }

    //SCOPE - RUN -> pakai this
    var alamatSaya = "Gading Serpong"
    alamatSaya.run {
        println("Saya tinggal di " + this)
    }

    //SCOPE - WITH
    var gradeSaya = with(90) {
        if(this >= 80) {
            "A"
        } else if (this >= 70) {
            "B"
        } else {
            "C"
        }
    }
    println("Grade kamu adalah $gradeSaya")

    //SCORE  - APPLY
    var dataMahasiswa = Mahasiswa().apply {
        nim = "122030"
        nama =" Christopher"
        ipk = 4
    }
    println("Mahasiswa ${dataMahasiswa.nama} dgn nim ${dataMahasiswa.nim} ipknya ${dataMahasiswa.ipk}")

    //SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(80, 75, 70, 68, 85)
    deretAngka.also {
        println("Sebelum $deretAngka")
    }.add(90)
    println("Setelah $deretAngka")
}