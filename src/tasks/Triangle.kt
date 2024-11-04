package tasks

class Triangle (val side1: Double, val side2: Double, val side3: Double) {

    fun isEquilateral() {
        if (side1 == side2) {
            if (side1 == side3)
                println("Equilateral")
            else println("Not Equilateral")
        }
        else println("Not Equilateral")
    }

}

fun main() {

    val countOfTriangle = readln().toInt()
    val triangles: MutableList<Triangle> = mutableListOf()

    for (i in 1..countOfTriangle) {
        val triangleData = readln().split(" ")
        triangles.add(Triangle(triangleData[0].toDouble(), triangleData[1].toDouble(), triangleData[2].toDouble()))
    }

    for (triangle in triangles)
        triangle.isEquilateral()

}