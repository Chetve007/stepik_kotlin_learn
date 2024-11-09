package tasks

open class Animal {

    open fun sound() {
        println("* звук животного или птицы")
    }
}

class Dog: Animal() {

    override fun sound() {
        println("Гав")
    }
}

class Cat: Animal() {

    override fun sound() {
        println("Мяу")
    }
}

class Bird: Animal() {

    override fun sound() {
        println("Чирик")
    }
}

fun main() {

    val anml = readln()

    var animal: Animal? = null
    when (anml) {
        "Dog" -> animal = Dog()
        "Cat" -> animal = Cat()
        "Bird" -> animal = Bird()
        else -> println("Можно только Dog, Cat, Bird")
    }
    animal?.sound()
}