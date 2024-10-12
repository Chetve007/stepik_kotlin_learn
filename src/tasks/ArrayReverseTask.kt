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

    for (i in arr.size - 1 downTo 0)
        println(arr[i])
}