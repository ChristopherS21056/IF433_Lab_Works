package oop_122030_ChristopherSunyoto_Week06.lab

interface Clickable {
    // ERROR : Property in an interface cannot have a backing field
    val name : String = "Tombol Rahasia"

    // Functiomn without body (implicity abstract)
    fun click()
}