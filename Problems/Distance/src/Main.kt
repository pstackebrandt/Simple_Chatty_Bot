import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val miles = scanner.nextDouble()
    val hours = scanner.nextDouble()

    println(miles / hours)
}
