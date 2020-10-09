import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val (a, b, c) = DoubleArray(3) { scanner.nextDouble() }

    ((c - b) / a)
            .also { println(it) }
}