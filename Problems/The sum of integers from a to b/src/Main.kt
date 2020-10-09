import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val range = scanner.nextInt()..scanner.nextInt()

    println(range.sum())
}