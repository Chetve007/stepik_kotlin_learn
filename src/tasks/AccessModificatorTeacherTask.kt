package tasks

class Teacher {

    internal var subject: String = ""

    fun setSubject(newSubject: String): Teacher {
        subject = newSubject
        return this
    }

    fun printSubject() {
        println("Subject: $subject")
    }
}

fun main() {

    val n = readln().toInt()
    val teachers: MutableList<Teacher> = mutableListOf()

    for (i in 1..n) {
        val subject = readln()
        teachers.add(Teacher().setSubject(subject))
    }

    for (teacher in teachers)
        teacher.printSubject()
}