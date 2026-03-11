package oop_122030_ChristopherSunyoto_Week06

// Manually override to resolve ambiguity
override fun turnOn() {
    super<Camera>.turnOn() // Menjalankan logika camera
    super<Phone>.turnOn()  // Menjalankan logika phone
    println("Sistem operasi smartphone berhasil booting")
}