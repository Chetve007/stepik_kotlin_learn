package tasks

fun main(){

    val s = readLine()
    val length = s!!.toInt()
    val l: MutableList<String> = mutableListOf()

    for (i in 1..length) {
        val x = readLine()!!.toString()
        l.add(x)
    }

    var flag = "true"
    val base = l[0]
    for (element in l) {
        if (base != element) {
            flag = "false"
            break
        }
    }
    println(flag)

}