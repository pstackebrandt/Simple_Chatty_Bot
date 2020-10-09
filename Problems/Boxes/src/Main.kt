import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val box1 = IntArray(3) { scanner.nextInt() }
    val box2 = IntArray(3) { scanner.nextInt() }

    println(checkBoxes(box1.toList(), box2.toList()))
}

fun checkBoxes(box1: List<Int>, box2: List<Int>): String {
    val sortedBox1 = box1.sorted()
    val sortedBox2 = box2.sorted()

    val box1HasLongerSide = firstHasLongerSide(sortedBox1, sortedBox2)
    val box2HasLongerSide = firstHasLongerSide(sortedBox2, sortedBox1)

    return when {
        box1HasLongerSide && box2HasLongerSide -> {
            "Incomparable"
        }
        box1HasLongerSide && !box2HasLongerSide -> {
            "Box 1 > Box 2"
        }
        !box1HasLongerSide && box2HasLongerSide -> {
            "Box 1 < Box 2"
        }
        else -> {
            "Box 1 = Box 2"
        }
    }
}

fun firstHasLongerSide(firstSortedList: List<Int>, secondSortedList: List<Int>): Boolean {

    for (digit in firstSortedList.withIndex()) {
        if (digit.value > secondSortedList[digit.index]) {
            return true
        }
    }

    return false
}
