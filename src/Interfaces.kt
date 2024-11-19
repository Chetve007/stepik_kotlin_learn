
interface Shape {
    fun area(): Double // Абстрактный метод
    fun perimeter(): Double // Абстрактный метод
    fun description() {
        println("Это геометрическая фигура")
    }
}

class Circle(val radius: Double) : Shape {

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

// Множественная реализация
interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

class Bird : Flyable, Swimmable {
    override fun fly() {
        println("Птица летит")
    }

    override fun swim() {
        println("Птица плавает")
    }
}