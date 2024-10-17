

fun main() {

    // Set - это неизменяемое множество, в котором каждый элемент уникален.
    // Элементы множества не упорядочены, и порядок их следования может быть произвольным.
    // Для создания множества можно использовать функцию setOf()
    val fruits: Set<String> = setOf("Apple", "Banana", "Orange")

    // MutableSet - это изменяемое множество, которое позволяет добавлять и удалять элементы.
    // Элементы множества также уникальны и не упорядочены.
    // Для создания изменяемого множества используйте функцию mutableSetOf()
    val numbers: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    // Добавление и удаление элементов
    numbers.add(6)
    numbers.remove(3) // Удалит элемент со значением 3

    // Пересечение множеств (Intersection)
    val set1 = setOf(1, 2, 3, 4, 5)
    val set2 = setOf(4, 5, 6, 7, 8)

    val intersection = set1.intersect(set2)
    println(intersection) // Результат: [4, 5]

    // Объединение множеств (Union)
    val set3 = setOf(1, 2, 3)
    val set4 = setOf(3, 4, 5)

    val union = set3.union(set4)
    println(union) // Результат: [1, 2, 3, 4, 5]

    // Альтернативно, для объединения множеств можно использовать оператор +
    println(set3 + set4) // Результат: [1, 2, 3, 4, 5]

    // Разность множеств (Difference)
    val set5 = setOf(1, 2, 3, 4, 5)
    val set6 = setOf(4, 5, 6, 7, 8)

    val difference = set5.subtract(set6)
    println(difference) // Результат: [1, 2, 3]

    // Альтернативно, для разности множеств можно использовать оператор -
    println(set5 - set6) // Результат: [1, 2, 3]

    // Проверка включения (Subset)
    val superset = setOf(1, 2, 3, 4, 5)
    val subset = setOf(2, 3)

    val isSubset = subset.all { it in superset }
    println(isSubset) // Результат: true

    // Порядок элементов и доступ по индексу
    // По умолчанию реализацией Set является LinkedHashSet, который сохраняет порядок вставки элементов.
    // Следовательно, функции, которые зависят от порядка элементов, такие как first() или last(),
    // возвращают предсказуемые результаты для таких множеств.
    // Альтернативной реализацией (разработчик должен объявлять явно) является HashSet - не сохраняет порядок элементов,
    // но требует меньше памяти для хранения того же количества элементов.
    val set = linkedSetOf("Apple", "Banana", "Orange")

    println(set.first()) // Результат: "Apple"
    println(set.last())  // Результат: "Orange"

    // Также у Set по умолчанию есть доступ по индексу с использованием функции elementAt(index)
    println(set.elementAt(0)) // Результат: "Apple"
    println(set.elementAt(1)) // Результат: "Banana"
    println(set.elementAt(2)) // Результат: "Orange"

}