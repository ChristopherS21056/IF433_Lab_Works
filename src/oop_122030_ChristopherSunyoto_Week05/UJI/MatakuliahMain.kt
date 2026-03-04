package oop_122030_ChristopherSunyoto_Week05.UJI

fun main() {
    val listMatkul: List<Matakuliah> = listOf(
        Wajib(),
        Elective()
    )
    println("Banyak tipe matkul: $listMatkul")

    // Panggil method anak anak -> si set_matkul()
    for(mku in listMatkul) {
        mku.set_matkul(3)
        // CARA 1 panggil method berbeda untuk all anak class
        if(mku is Wajib) {
            mku.ada_seminar()
        } else if (mku is Elective) {
            mku.ada_praktek()
        }
        // CARA 2 panggil methode berbeda untuk all anak class
        when(mku) {
            is Wajib -> {
                print("Wajib dari When : ")
                mku.ada_seminar()
            }
            is Elective -> {
                print("Elective dari When: ")
                mku.ada_praktek()
            }
        }
    }
}