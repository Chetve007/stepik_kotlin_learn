package tasks

fun main() {

    val s = readLine()
    val n = s!!.toInt()
    val nums: MutableSet<Int> = mutableSetOf()

    for (i in 1..n) {
        val t = readLine()
        val m = t!!.toInt()
        nums.add(m)
    }
    println(nums)

}