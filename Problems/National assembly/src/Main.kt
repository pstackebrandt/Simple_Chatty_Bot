import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val population = scanner.nextInt()
    val members = Math.cbrt(population.toDouble()).toInt()
    println(members)
}