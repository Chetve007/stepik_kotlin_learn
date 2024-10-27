package tasks

fun main() {

    val s1 = readLine()!!.toString()
    val s2 = readLine()!!.toString()

    val lmbdLine: (String, String) -> String = { s1, s2 -> "$s1 $s2"}
    println(lmbdLine(s1, s2))

}