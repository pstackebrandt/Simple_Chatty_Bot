import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val (a, b, c, d) = DoubleArray(4) { scanner.nextDouble() }

    (a * 10.5 + b * 4.4 + (c + d) / 2.2)
            .also { println(it) }
}