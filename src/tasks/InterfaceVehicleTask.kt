package tasks

interface Vehicle2 {
    fun drive(): Unit
}

class Car3: Vehicle2 {

    override fun drive() {
        println("Автомобиль едет")
    }
}

fun main() {

    val command = readln()
    if (command == "drive") {
        val car = Car3()
        car.drive()
    }
}