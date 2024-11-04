package tasks

object Logger {

    fun log(message: String) {
        println("Log: $message")
    }

}

fun main() {

    val countOfLogs = readln().toInt()
    val msgs: MutableList<String> = mutableListOf()

    for (i in 1..countOfLogs) {
        val logMsg = readln()
        msgs.add(logMsg)
    }

    for (msg in msgs)
        Logger.log(msg)

}