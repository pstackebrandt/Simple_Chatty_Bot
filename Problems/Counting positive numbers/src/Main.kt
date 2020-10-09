import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val grades = readNumbers(scanner)

    println(grades.count { it > 0 })
}

private fun readNumbers(scanner: Scanner): List<Int> {
    val sizesCount = scanner.nextInt()
    return IntArray(sizesCount) { scanner.nextInt() }
            .toList()
}