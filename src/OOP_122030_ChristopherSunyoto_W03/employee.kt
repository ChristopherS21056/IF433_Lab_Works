package oop_122030_ChristopherSunyoto.W03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR : Gaji tidak boleh negatif! Di set ke 0")
                field = 0 // Gunakan field, bukan this.salary
            } else {
                field ==  value // Gunakan field untuk assign nilai asli
            }
        }
}

// Hanya bisa diakses di file/class ini saja
private var performanceRating: Int = 3

fun increasePerformance() {
    performanceRating++
    println("Kinerja $bnamne meningkat! Rating: $performanc")
}