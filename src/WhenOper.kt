

fun main() {
    val x = 5
    when (x) {
        1 -> println("x равно 1")
        2 -> println("x равно 2")
        3 -> println("x равно 3")
        else -> println("x не равно ни одному из перечисленных значений")
    }

    // when может использовать диапазоны значений
    val y = 10
    when (y) {
        in 1..5 -> println("y в диапазоне от 1 до 5")
        in 6..10 -> println("y в диапазоне от 6 до 10")
        else -> println("y не входит в заданные диапазоны")
    }

    // when может использовать условия
    val z = 15
    when {
        z < 10 -> println("z меньше 10")
        z in 10..20 -> println("z в диапазоне от 10 до 20")
        else -> println("z больше 20")
    }

    // when можно использовать, чтобы присвоить значение переменной
    val age = 20
    val result = when {
        age < 18 -> "Ребенок"
        age in 18..64 -> "Взрослый"
        else -> "Пожилой человек"
    }
    println(result)

    // еще один вариант присвоения
    val letter = 'a'
    val result2 = when (letter) {
        'a', 'e', 'i', 'o', 'u' -> "Гласная буква"
        else -> "Согласная буква"
    }
    println(result2)
}