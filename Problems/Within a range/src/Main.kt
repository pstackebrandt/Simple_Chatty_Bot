import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val minA = scanner.nextInt()
    val maxA = scanner.nextInt()
    val minB = scanner.nextInt()
    val maxB = scanner.nextInt()
    val value = scanner.nextInt()

    println(value in minA..maxA || value in minB..maxB)
}