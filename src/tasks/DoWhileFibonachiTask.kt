package tasks

fun main() {
    val inStr = readLine()
    val num = inStr!!.toInt()
    var i = 0
    var x = 0
    var y = 1
    var result = 1

    do {
        println(result)
        y = x
        x = result
        result = x + y
        i++
    } while (num > i)
}