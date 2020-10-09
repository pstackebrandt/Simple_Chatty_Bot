import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    val numbers = listOf(a to b, a to c, b to c)
    println(checkSum(numbers))
}

private fun checkSum(numbers: List<Pair<Int, Int>>): Boolean {
    numbers.forEach { (x, y) ->
        if (x + y == 20) {
            return true
        }
    }

    return false
}