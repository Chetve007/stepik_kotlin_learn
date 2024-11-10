package tasks

open class Person3 {

    private var name: String = ""

     open fun setName(newName: String) {
        name = newName
    }

    open fun printName(): String {
        return "Name: $name"
    }
}

class Student2: Person3() {

    protected var studentId: Int = 0

    fun setStudentId2(newId: Int) {
        studentId = newId
    }

    fun printStudentDetails() {
        println("${printName()}, Student ID: $studentId")
    }
}

fun main() {

    val n = readln().toInt()
    val students: MutableList<Student2> = mutableListOf()

    for (i in 1..n) {
        val studentData = readln().split(" ")
        val student = Student2()
        student.setName(studentData[0])
        student.setStudentId2(studentData[1].toInt())
        students.add(student)
    }

    for (student in students)
        student.printStudentDetails()
}