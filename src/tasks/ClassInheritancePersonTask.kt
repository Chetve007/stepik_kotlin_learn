package tasks

open class Person(var name: String, var role: String) {

    open fun showInfo() {
        println("Имя: $name")
        println("Роль: $role")
    }
}

class Moderator(name: String, role: String = "Модератор"): Person(name, role) {
}

class Admin(name: String, role: String = "Администратор"): Person(name, role) {
}

fun main() {

    val prsn = readln()
    val personData = prsn.split(" ")

    var person: Person? = null
    when (personData[1]) {
        "Moderator" -> person = Moderator(personData[0])
        "Admin" -> person = Admin(personData[0])
        else -> println("Можно только Moderator, Admin")
    }
    person?.showInfo()

}