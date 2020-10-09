import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()

    print(when {
        number % 400 == 0 -> "Leap"
        number % 4 == 0 && number % 100 != 0 -> "Leap"
        else -> "Regular"
    })
}