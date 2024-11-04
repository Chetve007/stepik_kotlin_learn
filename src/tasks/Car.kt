package tasks

class Car(val brand: String, val year: Int) {

    fun printDetails() {
        println("Brand: $brand, Year: $year")
    }

}

fun main() {

    val countOfCars = readln().toInt()
    val cars: MutableList<Car> = mutableListOf()

    for (i in 1..countOfCars) {
        val carData = readln().split(" ")
        cars.add(Car(carData[0], carData[1].toInt()))
    }

    for (car in cars)
        car.printDetails()

}