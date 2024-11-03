class Classes {
}

class MyClass {
    // свойства (поля) класса
    var property1: Int = 0
    var property2: String = ""

    // функции (методы) класса
    fun myFunction() {
        println("Вызвана функция myFunction()")
    }
}

val myObject = MyClass()

// В Kotlin также существует возможность создания объектов без явного объявления класса с помощью конструкции object.
// Это так называемые объекты-одиночки (Singleton), которые могут использоваться для хранения глобальных данных или
// реализации шаблона проектирования Singleton.
// Объявление объекта-одиночки
object MySingleton {
    // свойства и функции объекта-одиночки
    fun myFunction() {
        println("MySingleton.myFunction()")
    }
}

val s = MySingleton.myFunction()

// Конструкторы
// Пример основного конструктора
class Person1(val name: String, var age: Int)

// Пример вспомогательного конструктора
class Person2 {
    var name: String = ""

    constructor(name: String) {
        this.name = name
    }
}

// Пример инициализации свойств класса при объявлении
class Person3 {
    var name: String = "John"
    var age: Int = 30
}

// Создание экземпляра класса и доступ к его свойствам
val person = Person3()
//println(person.name) // Выводит "John"
//println(person.age)  // Выводит 30