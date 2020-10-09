import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = IntArray(3) { scanner.nextInt() }
    println(countPositiveNumbersRecursive(numbers) == 1)
}

internal fun countPositiveNumbersRecursive(
    numbers: IntArray,
    indexOfNumberToCheck: Int = numbers.lastIndex,
    currentPositiveNumbersFound: Int = 0
): Int {
        
    val nextPosition = indexOfNumberToCheck - 1
    var currentCount = currentPositiveNumbersFound

    if (numbers[indexOfNumberToCheck] > 0) {
        currentCount++
    }
    
    if (nextPosition >= 0) {
        currentCount = countPositiveNumbersRecursive(numbers, nextPosition, currentCount)
    }
    
    return currentCount
}
