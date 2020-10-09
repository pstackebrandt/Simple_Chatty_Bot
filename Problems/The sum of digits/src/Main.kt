import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val strings = scanner.nextInt().toString()
    var result = 0
    for (i in strings) {
        result = Math.addExact(result, i.toString().toInt())
    }
    println(result)
}
