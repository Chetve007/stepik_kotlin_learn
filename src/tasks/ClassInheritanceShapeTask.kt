package tasks

open class Shape {

    open fun draw() {
        println("Рисуем фигуру")
    }
}

class Circle2: Shape() {

    override fun draw() {
        println("Рисуем круг")
    }
}

class Square: Shape() {

    override fun draw() {
        println("Рисуем квадрат")
    }
}

class Triangle2: Shape() {

    override fun draw() {
        println("Рисуем треугольник")
    }
}

fun main() {

    val shp = readln()

    var shape: Shape? = null
    when (shp) {
        "Circle" -> shape = Circle2()
        "Square" -> shape = Square()
        "Triangle" -> shape = Triangle2()
        else -> println("Можно только Circle, Square, Triangle")
    }
    shape?.draw()
}