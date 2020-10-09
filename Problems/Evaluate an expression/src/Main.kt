import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextDouble()

    val y = ((x + 1) * x + 1) * x + 1

    println(y)
}