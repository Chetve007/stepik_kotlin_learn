package tasks
import kotlin.math.PI
import kotlin.math.pow

class Circle(val radius: Double) {

    var area: Double = .0

    fun calculateArea() {
        area = PI * radius.pow(2.0)

    }
}

fun main() {
    val radius = readln().toDouble()

    val circle = Circle(radius)
    circle.calculateArea()

    println("Radius: ${circle.radius}")
    println("Area: ${circle.area}")
}