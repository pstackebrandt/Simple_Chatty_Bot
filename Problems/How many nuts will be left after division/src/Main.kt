import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println(leftProducts(consumers = scanner.nextInt(),
            products = scanner.nextInt()))
}

fun leftProducts(products: Int, consumers: Int) = products % consumers
