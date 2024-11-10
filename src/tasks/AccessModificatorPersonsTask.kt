package tasks

class Person2 {

    private var name: String = ""

    fun setName(newName: String): Person2 {
        name = newName
        return this
    }

    fun printName() {
        println("Name: $name")
    }
}

fun main() {

    val n = readln().toInt()
    val persons: MutableList<Person2> = mutableListOf()

    for (i in 1..n) {
        val name = readln()
        persons.add(Person2().setName(name))
    }

    for (person in persons)
        person.printName()
}