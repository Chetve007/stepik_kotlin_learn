package tasks

class MathOperations {

    fun add(a: Int, b: Int): Double {
        return a.toDouble() + b.toDouble()
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Int, b: Int): Double {
        return a.toDouble() - b.toDouble()
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Int, b: Int): Double {
        return a.toDouble() * b.toDouble()
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Int, b: Int): Double {
        return a.toDouble() / b.toDouble()
    }

    fun divide(a: Double, b: Double): Double {
        return a / b
    }

}

fun main() {

    val tp = readln()
    val operation = readln()
    val a = readln()
    val b = readln()

    val mathOperations = MathOperations()

    when (operation) {
        "add" -> when (tp) {
            "Int" -> println(mathOperations.add(a.toInt(), b.toInt()))
            "Double" -> println(mathOperations.add(a.toDouble(), b.toDouble()))
        }
        "subtract" -> when (tp) {
            "Int" -> println(mathOperations.subtract(a.toInt(), b.toInt()))
            "Double" -> println(mathOperations.subtract(a.toDouble(), b.toDouble()))
        }
        "multiply" -> when (tp) {
            "Int" -> println(mathOperations.multiply(a.toInt(), b.toInt()))
            "Double" -> println(mathOperations.multiply(a.toDouble(), b.toDouble()))
        }
        "divide" -> when (tp) {
            "Int" -> println(mathOperations.divide(a.toInt(), b.toInt()))
            "Double" -> println(mathOperations.divide(a.toDouble(), b.toDouble()))
        }
    }
}