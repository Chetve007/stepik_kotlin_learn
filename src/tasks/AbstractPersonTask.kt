package tasks

abstract class Person4 {
    abstract fun info(): String
}

class Student3 (val name: String, val age: Int): Person4() {

    override fun info(): String {
        return "Student: $name, Age: $age"
    }
}

class Teacher2 (val name: String, val subject: String): Person4() {

    override fun info(): String {
        return "Teacher: $name, Subject: $subject"
    }
}

fun main() {

    val person = readln()

    if (person == "student") {
        val name = readln()
        val age = readln().toInt()
        println(Student3(name, age).info())
    }
    else if (person == "teacher") {
        val name = readln()
        val subject = readln()
        println(Teacher2(name, subject).info())
    }

}