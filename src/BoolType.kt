

fun main() {
    var isTrue: Boolean = true
    val isFalse: Boolean = false

    val x = true
    val y = false

    val result1 = x && y  // Результат: false
    val result2 = x || y  // Результат: true
    val result3 = !x      // Результат: false

    val boolValue = true
    val stringValue = boolValue.toString()  // Результат: "true"

    val inputString = readLine()
    val bool = inputString!!.toBoolean()

//    val task = x && !x  чему равна переменная: true or false? Ответ - false
}