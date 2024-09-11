
fun main() {

    val hello = "Привет, мир!"
    val emptyString = String() // Создание пустой строки

    val firstName = "John"
    val lastName = "Doe"
    val fullName = firstName + " " + lastName // Результат: "John Doe"

    val fullNamePlus = firstName.plus(" ").plus(lastName) // Использование метода plus() дважды

    // Форматирование строк. В Kotlin для этого используется интерполяция строк.
    val name = "Alice"
    val greeting = "Привет, $name!" // Результат: "Привет, Alice!"
    val expression = "Вычисление выражений ${name[0]}${name.length} ${2 + 2}" // Результат: Вычисление выражений A5 4"

    val multiline = """
    Это многострочная строка.
    Здесь можно писать текст
    на нескольких строках.
    """

    // Если нужно убрать пробелы на переходах строк из многострочной строки, то можно использовать метод trimMargin()
    // В этом примере символ | используется как символ-разделитель по умолчанию.
    // После вызова trimMargin() все строки будут обрезаны по этому символу
    val multilineTrimMargin = """
    |Это многострочная строка.
    |Здесь можно писать текст
    |на нескольких строках.
    """.trimMargin()
    println(multilineTrimMargin)

    val str = "Привет"
    val len = str.length // Результат: 6

    val firstChar = str[0] // Результат: 'H'

    // Чтобы получить первый символ, можно использовать метод first()
    val firstCharF = str.first() // Результат: 'H'

    // Чтобы получить последний символ, можно использовать метод last()
    val lastChar = str.last() // Результат: 'o'

    // Чтобы получить последний индекс строки, можно использовать свойство lastIndex
    val lastIndex = str.lastIndex // Результат: 4 (индекс последнего символа в строке "Hello")

    // Разрезание строк
    val strHW = "Hello, World!"
    val substring1 = strHW.substring(7) // "World!"
    val substring2 = strHW.substring(0, 5) // "Hello"

    // Проверка наличия подстроки в строке
    val containsHello = strHW.contains("Hello") // true
    val containsFoo = strHW.contains("Foo") // false

}