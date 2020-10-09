import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println(if (scanner.nextInt() % 2 == 0) "EVEN" else "ODD")
}