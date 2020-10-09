import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(if (isTriangle(a, b, c)) "YES" else "NO")
}

internal fun isTriangle(a: Int, b: Int, c: Int) =
    a + b > c && a + c > b && b + c > a
