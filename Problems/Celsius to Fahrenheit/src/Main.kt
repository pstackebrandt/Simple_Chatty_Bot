import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val celsius = scanner.nextDouble()

    val fahrenheit = celsius * 1.8 + 32

    println(fahrenheit)
}