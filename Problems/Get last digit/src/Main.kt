import java.util.*
import kotlin.math.abs

/* Do not change code below */
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}

fun getLastDigit(a: Int) =
    abs(a % 10)

fun getLastDigit2(a: Int) =
    a.toString().last()
