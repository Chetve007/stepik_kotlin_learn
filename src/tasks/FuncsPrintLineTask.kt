package tasks

fun main() {

    val s = readLine()!!.toString()
    val n = readLine()!!.toInt()

    printLine(s, n)

}

fun printLine(line: String, num: Int) {
    for (i in 1..num)
        println(line)
}