import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = readNumbers(scanner)

    println(findLongestSequence(numbers))
}

fun findLongestSequence(numbers: List<Int>): Int {
    var longestSequence = 0
    var currentLength = 0
    var lastNumber: Int = Int.MIN_VALUE

    for (i in numbers) {
        if (i >= lastNumber) {
            currentLength++
        } else {
            currentLength = 1
        }
        
        if (currentLength > longestSequence) {
            longestSequence = currentLength
        }
        lastNumber = i
    }
    return longestSequence
}

private fun readNumbers(scanner: Scanner): List<Int> {
    val sizesCount = scanner.nextInt()
    return IntArray(sizesCount) { scanner.nextInt() }
            .toList()
}
