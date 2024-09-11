

fun main() {

    val letter: Char = 'A'

    val inputString = readLine()
    // Говорим компилятору что в переменной inputString существует значение и получаем первый символ
    val firstSymbol = inputString!![0]

    // У символа можно получить его числовое значение (код символа Unicode).
    val letterA: Char = 'A'
    val code: Int = letterA.code  // Получение символа 'A' как числа 65

    // Символы могут сравниваться между собой с использованием операторов сравнения
    val char1: Char = 'A'
    val char2: Char = 'B'
    val result: Boolean = char1 < char2  // Результатом будет true, так как в алфавите символ 'A' меньше 'B'

    val lttr: Char = 'A'
    val digit: Char = '7'
    val isLetter: Boolean = lttr.isLetter()  // Результатом будет true
    val isDigit: Boolean = digit.isDigit()     // Результатом будет true

    val letterRegister: Char = 'a'
    val upperCaseLetter: Char = letterRegister.uppercaseChar()  // Результатом будет 'A'
    val lowerCaseLetter: Char = upperCaseLetter.lowercaseChar()  // Результатом будет 'a'
}