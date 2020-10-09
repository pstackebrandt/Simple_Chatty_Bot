import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val values = IntArray(n) { scanner.nextInt() }
    println(values.sum())
}