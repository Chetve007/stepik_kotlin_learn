

fun main() {

    val numbers = arrayOf(1, 2, 3, 4, 5)
    val names = arrayOf("Alice", "Bob", "Charlie")

    // Доступ к элементам массива
    println(numbers[0]) // Выведет: 1
    println(numbers.get(0)) // Выведет: 1

    // Изменение элементов массива
    numbers[0] = 10
    println(numbers[0]) // Выведет: 10

    // Длина массива
    println(numbers.size) // Выведет: 5

    // Итерация по массиву
    for (number in numbers) {
        println(number)
    }

    // Массивы разных типов
    // Массивы в Kotlin могут содержать элементы различных типов данных,
    // но тип элементов должен быть определен при создании массива.
    val mixedArray = arrayOf("Alice", 1, 3.14, true)

    // Массивы примитивных типов
    // Для работы с примитивными типами данных (например, Int, Double, Boolean)
    // в Kotlin существуют специализированные массивы, такие как IntArray, DoubleArray, BooleanArray и другие.
    // Эти массивы более эффективны по памяти и производительности.
    val intArray = IntArray(5) // Создание пустого массива типа Int с длиной 5
    intArray[0] = 1
    intArray[1] = 2
    // и так далее...

    // Кстати говоря, добавлять новые элементы в массив можно не только по индексу, а ещё используя например
    var a: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    a += 1

}