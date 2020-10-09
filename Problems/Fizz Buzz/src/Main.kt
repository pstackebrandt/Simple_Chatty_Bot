import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val start = scanner.nextInt()
    val end = scanner.nextInt()
    val buzz = "Buzz"
    val fizz = "Fizz"

    var text: String
    for (i in start..end) {
        text = ""
        if (i % 3 == 0) text = fizz
        if (i % 5 == 0) {
            if (text.isEmpty()) {
                text = buzz
            } else {
                text += buzz
            }
        }
        if (text.isEmpty()) text = i.toString()
        println(text)
    }
}