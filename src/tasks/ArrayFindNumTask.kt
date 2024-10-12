package tasks

fun main(){
    val s0 = readLine()
    val x = s0!!.toInt()

    val s = readLine()
    val n = s!!.toInt()
    var arr = IntArray(n)

    for (i in 0..n-1) {
        var t = readLine()
        var m = t!!.toInt()
        arr[i] = m
    }

    var isFound = "false"
    for (a in arr) {
        if (x == a) {
            isFound = "true"
            break
        }
    }

    println(isFound)
}