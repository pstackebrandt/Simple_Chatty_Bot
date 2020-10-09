import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = IntArray(scanner.nextInt()) { scanner.nextInt() }
            .toList()

    numbers.sortedDescending()
            .let { it.first() * it.getOrElse(1) { 1 } }
            .also { println(it) }
   }
