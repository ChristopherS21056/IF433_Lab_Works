package oop_122030_ChristopherSunyoto_Week06.lab

interface Clickable {
    val name : String // Abstract property, tidak ada nilai default
    fun click()
    class Button(override val name : String) : Clickable {
        override fun click() {
            println ("Tombol '$name' berhasil diklik!")
        }
    }
}