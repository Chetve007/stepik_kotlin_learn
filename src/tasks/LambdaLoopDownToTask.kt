package tasks

fun main() {

    val n = readLine()!!.toInt()
    val countdown: (Int) -> Unit = fun(n: Int) {
        for (i in n downTo 0)
            println(i)
    }
    countdown(n)

}