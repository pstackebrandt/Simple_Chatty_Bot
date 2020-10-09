fun main(args: Array<String>) {
    val list: List<Long> = listOf(Int.MAX_VALUE.toLong(),
            Long.MAX_VALUE,
            Short.MAX_VALUE.toLong(),
            Byte.MAX_VALUE.toLong())
    list.sorted().forEach {
        println(it)
    }
}
