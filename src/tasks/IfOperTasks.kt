package tasks

fun main() {

//    val inStr = readLine()
//    val inStrToInt: Int = inStr!!.toInt()
//    if (inStrToInt >= 18)
//        println("Совершеннолетний")
//    if (inStrToInt in 1..17)
//        println("Несовершеннолетний")
//    if (inStrToInt <= 0)
//        println("Введено некорректное значение")

    // if else task
    val inStr = readLine()
    val inStrToInt = inStr!!.toInt()

    if (inStrToInt % 2 == 0)
        println("Число чётное")
    else
        println("Число нечётное")

}
