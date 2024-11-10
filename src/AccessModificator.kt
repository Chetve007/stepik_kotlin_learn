/*
В Kotlin есть четыре основных модификатора доступа:

public: Это модификатор доступа по умолчанию. Элементы с модификатором public доступны из любого места в программе,
где доступен класс, в котором они определены.

private: Этот модификатор доступа ограничивает видимость элемента только внутри класса, в котором он определен.
Элементы с модификатором private недоступны извне класса.

protected: Этот модификатор доступа аналогичен модификатору private, за исключением того,
что элементы с модификатором protected также доступны в подклассах.

internal: Этот модификатор доступа ограничивает видимость элемента модулем.
Элементы с модификатором internal доступны в пределах одного модуля, который может быть как отдельным файлом компиляции,
так и набором связанных файлов компиляции.
*/

// Пример класса с различными модификаторами доступа
class MyClass2 {
    public var publicProperty: Int = 0
    private var privateProperty: String = ""
    protected var protectedProperty: Double = 0.0
    internal var internalProperty: Boolean = true

    public fun publicFunction() {
        // Код функции
    }

    private fun privateFunction() {
        // Код функции
    }

    protected fun protectedFunction() {
        // Код функции
    }

    internal fun internalFunction() {
        // Код функции
    }
}

// Пример использования элементов класса с различными модификаторами доступа
fun main() {
    val obj = MyClass2()
    obj.publicProperty = 10 // Доступ к public свойству
    // obj.privateProperty = "Hello" // Недоступно из-за private свойства
    // obj.protectedProperty = 3.14 // Недоступно из-за protected свойства
    obj.internalProperty = false // Доступ к internal свойству

    obj.publicFunction() // Вызов public функции
    // obj.privateFunction() // Недоступно из-за private функции
    // obj.protectedFunction() // Недоступно из-за protected функции
    obj.internalFunction() // Вызов internal функции
}