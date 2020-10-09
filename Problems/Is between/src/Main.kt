import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val value = scanner.nextInt()
    val border1 = scanner.nextInt()
    val border2 = scanner.nextInt()

    val range = if (border1 <= border2) {
        border1..border2
    } else {
        border2..border1
    }

    println(value in range)
}