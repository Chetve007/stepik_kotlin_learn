
fun main() {
    val sb = StringBuilder("Hello")
    sb.append(" world") // Добавление к текущей строке
    println(sb.toString()) // Проверка промежуточного результата: "Hello world"

    sb.insert(5, ", Kotlin") // Вставка в позицию 5
    println(sb.toString()) // Проверка промежуточного результата: "Hello, Kotlin world"

    sb.delete(5, 13) // Удаление подстроки с 5 по 12 символ, чтобы оставалось "Hello world"
    println(sb.toString()) // Проверка промежуточного результата: "Hello world"

    sb.replace(0, 5, "Hi") // Замена первых 5 символов на "Hi"
    println(sb.toString()) // Ожидаемый результат: "Hi world"


    val sb2 = StringBuilder() // Создание пустого объекта StringBuilder
    val sbWithInitialValue = StringBuilder("Hello") // Создание StringBuilder через начальное значение
    val sbAppend = StringBuilder().append("Hello") // Создание StringBuilder с использованием функции append

    // Пример использования StringBuilder
    val sb3 = StringBuilder("Hello")
    sb3.append(" world") // Добавление к текущей строке
    println(sb3.toString()) // Проверка промежуточного результата: "Hello world"
    sb3.insert(5, ", Kotlin") // Вставка в позицию 5
    println(sb3.toString()) // Проверка промежуточного результата: "Hello, Kotlin world"
    sb3.delete(5, 13) // Удаление подстроки с 5 по 12 символ, чтобы оставалось "Hello world"
    println(sb3.toString()) // Проверка промежуточного результата: "Hello world"
    sb3.replace(0, 5, "Hi") // Замена первых 5 символов на "Hi"
    println(sb3.toString()) // Ожидаемый результат: "Hi world"

}