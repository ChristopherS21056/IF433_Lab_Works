package oop_122030_ChristopherSunyoto_Week11

// function biasa
fun panggil_nama (nama:String): String {
    return "Hai $nama"
}

// function extensionfunction - basic
fun String.panggil_mahasiswa(): String {
    // return "Hello $this"
    var hasil = this.split(" ").joinToString (" "){
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }

    return hasil
}

fun main() {
    // cara panggil function biasa
    println(panggil_nama("Toni").uppercase())

    // cara panggil function extension - BASIC
    println("tonyy stark iron man".panggil_mahasiswa())


}
//