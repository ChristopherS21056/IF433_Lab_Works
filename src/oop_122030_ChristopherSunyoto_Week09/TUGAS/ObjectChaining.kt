package oop_122030_ChristopherSunyoto_Week09.TUGAS

data class Student(val name: String, val gpa: Double)

fun main() {
    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.2),
        Student("Citra", 3.2),
        Student("Dewi", 3.2)
    )

    println("=== HONOR STUDENTS PIPELINE ===")

    // Kita butuh NAMA mahasiswa yang GPA-nya >= 3.5, dan diurutkan abjad
    val honorNames = students
        .filter { it.gpa >= 3.5}   //1. Buang yang GPA < 3.5
        .sortedBy { it.name }   //2. Urutkan berdasarkan NAMA
        .map { it.name.uppercase() }   //3. Ambil namanya saja dan jadikan kapital
    honorNames.forEach { println("Honor Roll: $it") }
}