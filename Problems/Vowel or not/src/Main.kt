import java.util.Scanner

fun isVowel(letter: Char) =
        letter.toLowerCase() in listOf('a', 'o', 'e', 'i', 'u')

fun main() {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}