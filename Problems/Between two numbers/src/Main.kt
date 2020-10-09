import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val value = scanner.nextInt()
    val min = scanner.nextInt()
    val max = scanner.nextInt()

    println(min < max && value in min..max)
}