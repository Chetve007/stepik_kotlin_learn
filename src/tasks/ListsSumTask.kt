package tasks

fun main(){
    val s = readLine()
    val length = s!!.toInt()
    var l: MutableList<Int> = mutableListOf()

    for (i in 1..length) {
        val x = readLine()
        val n = x!!.toInt()
        l.add(n)
    }

    var result = 0
    for (element in l)
        result += element * element

    println(result)
}