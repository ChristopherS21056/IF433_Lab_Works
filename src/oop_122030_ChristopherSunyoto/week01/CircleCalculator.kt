package oop_122030_ChristopherSunyoto.week01

fun main(args: Array<String>) {
    // Variable definition
    var radius: Double = 7.0
    var pi: Double = 3.14

    // Calculation
    var area: Double = pi * radius * radius

    // Output Concatenation
    println("Radius: " + radius + ", Area: " + area)

    // Login check
    checkSize(area)
}

fun checkSize(area : Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}