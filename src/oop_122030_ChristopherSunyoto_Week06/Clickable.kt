package oop_122030_ChristopherSunyoto_Week06

interface Clickable {
    // ERROR : Property in an interface cannot have a backing field
    val name : String = "Tombol Rahasia"

    // Functiomn without body (implicity abstract)
    fun click()
}
