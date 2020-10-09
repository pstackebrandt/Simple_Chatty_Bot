import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numbers = IntArray(3) { scanner.nextInt() }
    println(numbers.toSet().count() == 3)
}
