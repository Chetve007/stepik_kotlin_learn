package tasks

class Calculator {

    fun calculate(a: Int, b: Int): Int {
        return a + b
    }

    fun calculate(a: Double, b: Double): Double {
        return a * b
    }

    fun calculate(a: String, b: String): String {
        return a + b
    }

}

fun main() {

    val operation = readln()
    val a = readln()
    val b = readln()

    val calc = Calculator()

    when (operation) {
        "add" -> println(calc.calculate(a.toInt(), b.toInt()))
        "multiply" -> println(calc.calculate(a.toDouble(), b.toDouble()))
        "concatenate" -> println(calc.calculate(a, b))
    }
}