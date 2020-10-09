import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val grades = readGrades(scanner)
    val sums = GradesSums.sumGrades(grades)
    println("${sums.d} ${sums.c} ${sums.b} ${sums.a}")
}

private fun readGrades(scanner: Scanner): List<Int> {
    val sizesCount = scanner.nextInt()
    return IntArray(sizesCount) { scanner.nextInt() }
            .toList()
}

data class GradesSums(val d: Int, val c: Int, val b: Int, val a: Int) {
    companion object {
        fun sumGrades(values: List<Int>): GradesSums {
            val sums = values.groupingBy { it }.eachCount()

            return GradesSums(sums[2] ?: 0,
                    sums[3] ?: 0,
                    sums[4] ?: 0,
                    sums[5] ?: 0)
        }
    }
}
