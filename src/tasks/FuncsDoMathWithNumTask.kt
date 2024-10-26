package tasks

fun main() {

    val num = readLine()!!.toInt()
    smthWithNum(num)
}

fun smthWithNum(n: Int) {
    var num = n + 1
    println(num)
    num -= 2
    println(num)
}