import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val range = scanner.nextInt()..scanner.nextInt()
    val n = scanner.nextInt()

    var divisions = 0
    for (i in range) {
        if (i % n == 0) divisions++
    }

    println(divisions)
}