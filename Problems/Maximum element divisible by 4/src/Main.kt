import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = readNumbers(scanner)
    val maxDivisibleBy4 = getMaxDivisibleBy4(numbers)

    println(maxDivisibleBy4)
}

fun getMaxDivisibleBy4(numbers: List<Int>): Int {
    val divisibleBy4 = numbers.filter { it % 4 == 0 }
    return divisibleBy4.sorted()
            .last()
}

private fun readNumbers(scanner: Scanner): List<Int> {
    val sizesCount = scanner.nextInt()
    return IntArray(sizesCount) { scanner.nextInt() }
            .toList()
}