package tasks

fun main() {

    val inElements = readLine()!!.toString()
    val listElements = inElements.replace(" ", "").split(",")
    val mutableMap: MutableMap<String, Int> = mutableMapOf()

    for (element in listElements) {
        if (mutableMap[element] == null) mutableMap[element] = 1
        else mutableMap[element] = mutableMap[element]!! + 1
    }

    println(mutableMap)

}