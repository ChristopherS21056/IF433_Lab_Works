//package oop_122030_ChristopherSunyoto_Week05
//
//fun main () {
//    val dosen1 = Dosen("Pak Alex", "0123456")
//    val admin1 = Admin("Bu Siti")
//
//    // Polymorphic Collection list yang berisi tipe parent, tapi isinya objek anak
//    val daftarPegawai : List<Pegawai> = listOf(dosen1, admin1)
//
//    println(" === AKTIVITAS PEGAWAI ===")
//    for (pegawai in daftarPegawai) {
//        // Pemanggilan runtime polymorphism
//        pegawai.bekerja()
//
//        // Pegawai.mengajar()  // INI AKAN ERROR karena tipe referensinya adalah Pegawai
//            // Smart Casting dengan is dan when
//        when (pegawai) {
//            is Dosen -> {
//                println("=> Terdeteksi sebagai dosen (NIDN: ${pegawai.nidn}")
//                pegawai.mengajar()  // SMART cast! tidak perlu manual casting (as)
//            }
//            is Admin -> {
//                println("=> Terdeteksi sebagai admin")
//                pegawai.doAdminWork()
//            }
//        }
//        println("------------------------")
//    }
//}
