import java.util.*

const val GRAVITY = 9.8 // m/s*s

fun main() {
    val scanner = Scanner(System.`in`)
    val density = scanner.nextDouble()
    val height = scanner.nextDouble()

    val pressure = GRAVITY * density * height

    println(pressure)
}