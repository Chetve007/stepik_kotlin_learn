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

    var maxEl = arr[0]
    for (a in arr) {
        if (maxEl < a)
            maxEl = a
    }

    println(maxEl)

}