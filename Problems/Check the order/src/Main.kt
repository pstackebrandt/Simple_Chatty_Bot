import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numbers = IntArray(scanner.nextInt()) { scanner.nextInt() }.toList()

    println(if (numbers.toString() == numbers.sorted().toString()) {
        "YES"
    } else {
        "NO"
    })
}