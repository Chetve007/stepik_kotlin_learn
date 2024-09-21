
fun main() {
    val x = 10
    if (x > 5) {
        println("x больше 5")
    }

    var num = -5
    var result = "Отрицательное число"
    num += 2*3 / (6-5)
    if (num > 0) {
        result = "Положительное число"
    }
    num -= (1-4) * 20/10 + 1
    if (num < 0) {
        result = "Отрицательное число"
    }
    println(result)

    // if ... else
    val y = 10
    if (y > 5) {
        println("y больше 5")
    } else {
        println("y меньше или равен 5")
    }

    // var 2
    // Обратите внимание: отличие конструкции else if от второго if в том, что второй if выполняется в любом случае,
    // а else if только тогда, когда предыдущее условие было неверно
    val nume = 0
    if (nume > 0) {
        println("Число положительное")
    } else if (nume < 0) {
        println("Число отрицательное")
    } else {
        println("Число равно нулю")
    }

    // var 3
    val result2 = if (y > 5) {
        "y больше 5"
    } else {
        "y меньше или равен 5"
    }
    println(result2)

    // var 4
    val result3 = if (y == 1) "Единица" else "Не единица"

}