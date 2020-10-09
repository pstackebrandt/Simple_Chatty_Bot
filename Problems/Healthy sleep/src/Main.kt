import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val h = scanner.nextInt()

    println(checkSleepHours(a, b, h))
}

private fun checkSleepHours(
    minHours: Int,
    maxHours: Int,
    sleepHours: Int
) =
    when {
        sleepHours < minHours -> "Deficiency"
        sleepHours > maxHours -> "Excess"
        else -> "Normal"
    }
