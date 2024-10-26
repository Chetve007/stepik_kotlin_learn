package tasks

fun main() {

    val one = readLine()!!.toBoolean()
    val two = readLine()!!.toBoolean()
    val three = readLine()!!.toBoolean()

    println(majorityDecision(one, two, three))
}

fun majorityDecision(one: Boolean, two: Boolean, three: Boolean) : Boolean {
    var flag = false
    var count = 0
    if (one)
        count++
    if (two)
        count++
    if (three)
        count++

    if (count >= 2)
        flag = true

    return flag
}