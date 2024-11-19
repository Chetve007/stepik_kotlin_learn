package tasks

abstract class Shape3 {
    abstract fun draw(): String
}

class Circle4: Shape3() {

    override fun draw(): String {
        return "Drawing a circle"
    }
}

class Square2: Shape3() {

    override fun draw(): String {
        return "Drawing a square"
    }
}

fun main() {

    val shape = readln()

    if (shape == "circle") println(Circle4().draw())
    else if (shape == "square") println(Square2().draw())

}