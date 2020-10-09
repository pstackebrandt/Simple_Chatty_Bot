import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val subtrahend = scanner.nextDouble()
    val minuend = scanner.nextDouble()

    (minuend - subtrahend)
            .also { println(it) }
}