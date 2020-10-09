import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()

    print(when {
        number < 0 -> "negative"
        number > 0 -> "positive"
        else -> "zero"
    })
}