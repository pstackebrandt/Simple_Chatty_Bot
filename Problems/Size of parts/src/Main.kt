import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val sizes = readSizes(scanner)
    val sizesSums = SizesSums.sumSizes(sizes)

    println("${sizesSums.perfect} ${sizesSums.larger} ${sizesSums.smaller}")
}

data class SizesSums(val larger: Int, val smaller: Int, val perfect: Int) {
    companion object {
        fun sumSizes(values: List<Int>): SizesSums {
            val larger = values.filter { it == 1 }.count()
            val smaller = values.filter { it == -1 }.count()
            val perfect = values.size - (larger + smaller)

            return SizesSums(larger, smaller, perfect)
        }
    }
}

private fun readSizes(scanner: Scanner): List<Int> {
    val sizesCount = scanner.nextInt()
    return IntArray(sizesCount) { scanner.nextInt() }.toList()
}