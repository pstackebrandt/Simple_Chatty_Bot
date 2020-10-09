import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val allFactors = scanner.nextLong() until scanner.nextLong()

    println(allFactors.reduce { product, factor -> product * factor })
}
