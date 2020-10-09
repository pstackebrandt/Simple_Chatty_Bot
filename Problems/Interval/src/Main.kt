import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextLong()

    if (number in -14L..12L ||
            number in 15L..16L ||
            number in 19L..Long.MAX_VALUE) {
        println("True")
    } else println("False")
}
