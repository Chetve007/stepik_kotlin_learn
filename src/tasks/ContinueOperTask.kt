package tasks

fun main() {

    val border = readLine()
    val borderInt = border!!.toInt()

    for (i in 1..borderInt) {
        val num = (i * i * i) % 10
        if (num == 6 || num == 7) continue
        println(i)
    }
}