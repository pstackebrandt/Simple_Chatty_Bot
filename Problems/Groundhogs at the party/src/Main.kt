import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println(isCupsNumberHealthy(
            reeses = scanner.nextInt(),
            isWeekend = scanner.nextBoolean()))
}

private fun isCupsNumberHealthy(reeses: Int, isWeekend: Boolean): Boolean {
    val healthyCups = listOf(
            HealthyCupLimit(10..20, false),
            HealthyCupLimit(15..25, true)
    )
    healthyCups.forEach { cupLimit ->
        if (isWeekend == cupLimit.isWeekend &&
                reeses in cupLimit.healthyCups) {
            return true
        }
    }
    return false
}

data class HealthyCupLimit(val healthyCups: IntRange, val isWeekend: Boolean)
