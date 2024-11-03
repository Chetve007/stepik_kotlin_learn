class topLevelClasses {
    var property1: Int = 0
    var property2: String = ""

    fun myFunction() {
        println("Вызвана функция myFunction()")
    }
}

// Вложенные классы (Nested Classes)
class Outer {
    class Nested {
        fun nestedFunction() {
            println("Вызвана функция вложенного класса")
        }
    }
}

// Внутренние классы (Inner Classes)
// Внутренние классы в Kotlin объявляются с использованием ключевого слова inner.
// Такие классы имеют доступ к членам внешнего класса.
class OuterInner {
    private val greeting = "Привет из внешнего класса"

    inner class Inner {
        fun innerFunction() {
            println(greeting) // Доступ к переменной внешнего класса
        }
    }
}

// Локальные классы (Local Classes)
fun outerFunction2() {
    class LocalClass {
        fun localFunction() {
            println("Вызвана функция локального класса")
        }
    }
    val localObject = LocalClass()
    localObject.localFunction() // Вызов метода локального класса
}

fun main() {
    val myObject = MyClass()
    myObject.myFunction() // Вызов метода класса на верхнем уровне

    val nested = Outer.Nested()
    nested.nestedFunction() // Вызов метода вложенного класса

    val outer = OuterInner()
    val inner = outer.Inner()
    inner.innerFunction() // Вызов метода внутреннего класса

    outerFunction2() // Вызов внешней функции
}