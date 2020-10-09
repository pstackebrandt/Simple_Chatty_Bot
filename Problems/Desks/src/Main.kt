import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println(getDesks(getStudents(scanner)))
}

private fun getDesks(studentGroups: List<Int>) =
        studentGroups.map {
            it / 2 + it % 2
        }.sum()

private fun getStudents(scanner: Scanner) =
        mutableListOf<Int>().apply {
            while (scanner.hasNextInt()) {
                this.add(scanner.nextInt())
            }
        }
