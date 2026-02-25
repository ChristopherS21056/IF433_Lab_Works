package oop_122030_ChristopherSunyoto_Week04

// Car "Is-A" Vehicle. Parameter brand dilempar ke atas melalui Vehicle(brand)
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    open fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate() // Memanggil logika penambahan kecepatan milik parent
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}