package oop_122030_ChristopherSunyoto_Week04

class ElectricCar(brand: String,  numberOfDoors: Int, val batteryCapacity: Int) :Car(brand, numberOfDoors)  {
    override fun openTrunk() {
        println("Bagasi mobil dari $brand dengan $numberOfDoors pintu dibuka ke atas")
    }
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")
    }


}