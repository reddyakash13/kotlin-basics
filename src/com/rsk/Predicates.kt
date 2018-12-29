package com.rsk

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5)

    val greaterThanThree = { v: Int -> v > 3}

    var largeInts = ints.all { it > 3 }

    println(largeInts)

    largeInts = ints.any { it > 3}

    println(largeInts)

    largeInts = ints.any(greaterThanThree)

    println(largeInts)

    var found = ints.count(greaterThanThree)

    println(found)

    val find = ints.find(greaterThanThree)

    println(find)

}