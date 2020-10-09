import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    val knight1 = scanner.nextInt() to scanner.nextInt()
    val knight2 = scanner.nextInt() to scanner.nextInt()

    println(if (isKnightBeatDistance(knight1, knight2)) "YES" else "NO")
}

fun isKnightBeatDistance(knight1: Pair<Int, Int>, knight2: Pair<Int, Int>): Boolean {
    val distanceOfKnights = listOf(abs(knight1.first - knight2.first),
            abs(knight1.second - knight2.second))
            .sorted()

    return distanceOfKnights[0] == 1 && distanceOfKnights[1] == 2
    // true: distance of knights is (x, y) == (1, 2) or (2, 1)
}