

fun main() {

    // val lambdaName: (parameters) -> returnType = { arguments -> expression }
    val square: (Int) -> Int = { x -> x * x }

    // Лямбда-выражения можно передавать в качестве аргументов другим функциям
    fun operate(x: Int, operation: (Int) -> Int): Int {
        return operation(x)
    }
    val result = operate(5, { x -> x * x }) // result = 25

    // Анонимные функции.
    // Кроме лямбда-выражений, в Kotlin также можно использовать анонимные функции,
    // которые представляют собой более явную форму записи анонимных функций.
    val square2: (Int) -> Int = fun(x: Int): Int {
        return x * x
    }

    // лямбда-выражение, считающее удвоенную сумму двух чисел
    val sumTwice: (Int, Int) -> Int = { x, y -> (x + y) * 2 }

    // правильно использует лямбда-выражение с несколькими параметрами
    val operation: (Int, String) -> String = { x, y -> "Result: $x and $y" }

}