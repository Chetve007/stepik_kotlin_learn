package tasks

class Student {

    var name: String = ""
    var age: Int = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

fun main() {

    val countOfStudents = readln().toInt()
    val listOfStudents: MutableList<Student> = mutableListOf()

    for (i in 1..countOfStudents) {
        val studentData = readln().split(" ")
        listOfStudents.add(Student(studentData[0], studentData[1].toInt()))
    }

    for (student in listOfStudents)
        println("Name: ${student.name}, Age: ${student.age}")
}