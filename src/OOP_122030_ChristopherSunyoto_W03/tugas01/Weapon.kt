package oop_122030_ChristopherSunyoto.week03.tugas01

class weapon (val name: String) {

    var damage: Int = 0
        set (value) {
            if (value < 0) {
                println("Damage tidak boleh negatif!")
                return
            }

            if (value > 1000) {
                println("Damage terlalu besar! Di set menjadi 1000")
                field = 1000
            } else {
                field = value
            }
        }

}