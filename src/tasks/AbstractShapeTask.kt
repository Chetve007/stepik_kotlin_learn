package tasks

abstract class Shape2 {
    abstract fun area(): Double
}

class Circle3 (val radius: Double): Shape2() {

    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle (val a: Double, val b: Double): Shape2() {

    override fun area(): Double {
        return a * b
    }
}

fun main() {

    val shape = readln()

    if (shape == "circle") {
        val radius = readln().toDouble()
        println("Area: " + Circle3(radius).area())
    }
    else if (shape == "rectangle") {
        val a = readln().toDouble()
        val b = readln().toDouble()
        println("Area: " + Rectangle(a, b).area())
    }

}