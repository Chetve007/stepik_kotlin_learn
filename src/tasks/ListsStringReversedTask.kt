package tasks

fun main(){

    val s = readLine()
    val length = s!!.toInt()
    val l: MutableList<String> = mutableListOf()

    for (i in 1..length) {
        val x = readLine()!!.toString()
        l.add(x)
    }
    println(l.reversed())

    // or
    val reversedList = l.reversed()
    for (element in reversedList)
        println(element)

}