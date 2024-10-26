
// Функции могут быть объявлены как в верхнем уровне файла, так и внутри других функций или классов.

fun greet() {
    println("Привет, мир!")
}

// Пример функции, возвращающей значение
fun sum(a: Int, b: Int): Int {
    return a + b
}

val result = sum(3, 5) // result = 8

// Если функция не возвращает значение (т.е. возвращаемый тип Unit), оператор return можно опустить
fun greet2(name: String) {
    println("Привет, $name!")
}

// Вложенные функции (Local Functions)
fun outerFunction() {
    println("Это внешняя функция")

    fun innerFunction() {
        println("Это внутренняя функция")
    }

    innerFunction() // Вызов внутренней функции внутри внешней
}

class Greeter {
    fun greet(name: String) {
        println("Привет, $name!")
    }
}

fun main() {
    outerFunction() // Вызов внешней функции

    val greeter = Greeter()
    greeter.greet("Alice") // Вызов метода класса

    val result = sum(3, 5)
    println(result)
}