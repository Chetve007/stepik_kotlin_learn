package tasks

fun main(){

    val s = readLine()
    val n = s!!.toInt()
    var arr = IntArray(n)

    for (i in 0..n-1) {
        var t = readLine()
        var m = t!!.toInt()
        arr[i] = m
    }

    var even = 0
    for (a in arr) {
        if (a % 2 == 0) even++
    }

    println(even)
}