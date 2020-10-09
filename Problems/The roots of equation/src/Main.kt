import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val allNumbers = 0..1000
    val (a, b, c, d) = IntArray(4) { scanner.nextInt() }

    val solutions = getSolutions(allNumbers, a, b, c, d)
    solutions.forEach { println(it) }
}

private fun getSolutions(allNumbers: IntRange, a: Int, b: Int, c: Int, d: Int): List<Int> {
    val solutions = mutableListOf<Int>()
    allNumbers.forEach {
        if (d + (c + (b + a * it) * it) * it == 0) {
            solutions.add(it)
        }
    }

    return solutions
}