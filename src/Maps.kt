
fun main() {

    // Словарь (Map) - это коллекция, которая хранит элементы в виде пары "ключ-значение".
    // В Kotlin есть два основных типа мап: Map и MutableMap

    val map: Map<String, Int> = mapOf("one" to 1, "two" to 2, "three" to 3)
    val mutableMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2, "three" to 3)

    // Добавление и удаление элементов
    // Для добавления элемента в MutableMap используйте метод put(),
    // а для удаления элемента - методы remove() или removeAll()
    mutableMap.put("four", 4)  // or mutableMap["four"] = 4
    mutableMap.remove("two") // Удалит элемент с ключом "two"

    // Получение значений
    val value = map["two"] // Получит значение 2
    val value2 = map.get("two") // get() - // Получит значение 2
    val nonExistentValue = map["four"] // Получит null, так как ключ "four" не существует
    val defaultValue = map.getOrDefault("five", 0) // Получит 0, так как ключ "four" не существует

}