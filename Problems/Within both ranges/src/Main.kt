import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val range1 = scanner.nextInt()..scanner.nextInt()
    val range2 = scanner.nextInt()..scanner.nextInt()
    val number = scanner.nextInt()
    if (number in range1 && number in range2) {
        println(true)
    } else println(false)
}
