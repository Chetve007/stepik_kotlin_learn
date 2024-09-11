package tasks

fun main() {
    val inStr = readlnOrNull()
    val substringInStr = inStr!!.substring(0, 2)
    val sb: StringBuilder = StringBuilder(inStr)

    sb.delete(0, 2)
    sb.append(substringInStr)

    println(sb.toString())

}