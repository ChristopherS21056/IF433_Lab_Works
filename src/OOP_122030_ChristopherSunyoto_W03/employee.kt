package oop_122030_ChristopherSunyoto.W03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // PERINGATAN: KODE DI BAWAH INI SALAH DAN BERBAHAYA!
            // kITA MEMANGGIL SETTER DI DALAM SETTER (recursive)
           this.salary = value

        }
}