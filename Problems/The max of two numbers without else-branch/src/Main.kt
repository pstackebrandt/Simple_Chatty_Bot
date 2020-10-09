import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    println(max(a, b))
}

private fun max(a: Int, b: Int): Int {
    if (a >= b) return a
    return b
}