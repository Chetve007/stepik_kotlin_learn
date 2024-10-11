
fun main() {

    // Пример использования break
    for (i in 1..10) {
        if (i == 5) {
            break  // завершаем цикл, если i равно 5
        }
        println(i)
    }

    // Пример использования continue
    for (i in 1..5) {
        if (i == 3) {
            continue  // пропускаем текущую итерацию, если i равно 3
        }
        println(i)
    }

}