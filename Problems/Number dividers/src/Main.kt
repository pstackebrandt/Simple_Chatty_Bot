import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()

    val divisors = listOf(2, 3, 5, 6)

    divisors.forEach {
        if (number % it == 0) {
            println("Divided by $it")
        }
    }
}