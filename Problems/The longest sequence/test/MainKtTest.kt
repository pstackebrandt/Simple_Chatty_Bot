package longest_sequence

import findLongestSequence

class FindLongestSequenceTest {

    @org.junit.Test
    fun test() {
        assert(true)
    }

    @org.junit.Test
    fun one_short_sequence_only_test() {
        val numbers = listOf<Int>(1, 2, 3)
        val actual = findLongestSequence(numbers)
        println("actual = $actual")
        assert(actual == 3)
    }

   @org.junit.Test
    fun should_find_one_of_2_sequences() {
        val numbers = listOf<Int>(1, 2, 4, 1, 2, 3, 5, 7, 8, 9, 10, 11)
        val actual = findLongestSequence(numbers)
        println("actual = $actual")
        assert(actual == 9)
    }

    @org.junit.Test
    fun should_find_one_of_3_sequences() {
        val numbers = listOf<Int>(1, 2, 4, 1, 2, 2, 5, 7, 4, 3)
        val actual = findLongestSequence(numbers)
        println("actual = $actual")
        assert(actual == 5)
    }

    @org.junit.Test
    fun oneValue() {
        val numbers = listOf<Int>(3)
        val actual = findLongestSequence(numbers)
        println("actual = $actual")
        assert(actual == 1)
    }
}