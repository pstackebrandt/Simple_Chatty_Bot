import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val value = scanner.nextInt()
    println(value in 1..9)
}