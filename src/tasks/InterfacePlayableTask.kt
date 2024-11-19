package tasks

interface Playable {
    fun play(): Unit
}

class Guitar: Playable {

    override fun play() {
        println("Играет гитара")
    }
}

fun main() {

    val command = readln()
    if (command == "play") {
        val guitar: Playable = Guitar()
        guitar.play()
    }
}