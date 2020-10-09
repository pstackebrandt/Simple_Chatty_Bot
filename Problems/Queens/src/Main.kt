import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    val queen1 = scanner.nextInt() to scanner.nextInt()
    val queen2 = scanner.nextInt() to scanner.nextInt()

    println(if (isQueensTake(queen1, queen2)) "YES" else "NO")
}

fun isQueensTake(queen1: Pair<Int, Int>, queen2: Pair<Int, Int>): Boolean {
    if (queen1.first == queen2.first || queen1.second == queen2.second) return true

    val pos = abs(queen1.first - queen2.first) to abs(queen1.second - queen2.second)
    if (pos.first == pos.second) return true

    return false
}
