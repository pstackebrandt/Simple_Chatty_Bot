import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val numbers = IntArray(size) { scanner.nextInt() }
    println(numbers.min())
}