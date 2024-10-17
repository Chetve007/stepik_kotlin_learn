package tasks

fun main() {

    val sFirst = readLine()
    val nFirst = sFirst!!.toInt()
    val set1: MutableSet<String> = mutableSetOf()
    val set2: MutableSet<String> = mutableSetOf()

    for (i in 1..nFirst) {
        val t = readLine()
        val m = t!!.toString()
        set1.add(m)
    }

    val sSecond = readLine()
    val nSecond = sSecond!!.toInt()

    for (i in 1..nSecond) {
        val t = readLine()
        val m = t!!.toString()
        set2.add(m)
    }

    val isSubset = set1.all { it in set2 }
    println(isSubset)

}