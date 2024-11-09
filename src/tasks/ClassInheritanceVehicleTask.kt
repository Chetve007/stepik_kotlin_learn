package tasks

open class Vehicle {

    open fun drive() {
        println("Едем на транспортном средстве")
    }
}

class Car2: Vehicle() {

    override fun drive() {
        println("Едем на машине")
    }
}

class Bicycle: Vehicle() {

    override fun drive() {
        println("Едем на велосипеде")
    }
}

class Boat: Vehicle() {

    override fun drive() {
        println("Плывем на лодке")
    }
}

fun main() {

    val vhcl = readln()

    var vehicle: Vehicle? = null
    when (vhcl) {
        "Car" -> vehicle = Car2()
        "Bicycle" -> vehicle = Bicycle()
        "Boat" -> vehicle = Boat()
        else -> println("Можно только Car, Bicycle, Boat")
    }
    vehicle?.drive()

}