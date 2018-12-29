package com.rsk

fun main(args: Array<String>) {
    var ints = listOf(1, 2, 3, 4, 5)

    var smallInts = ints.filter { it < 4 }

    println(smallInts)

    val squaredInts = ints.map { it * it }

    println(squaredInts)

    var smallSquaredInts = ints.filter { it < 5 }.map { it * it }

    println(smallSquaredInts)

    val meetins = listOf(MeetingNew(1, "Board Meeting"), MeetingNew(2, "Committee Meeting"))

    var titles = meetins.map { it.title }

    println(titles)

    var people = meetins.flatMap { it.people } . distinct()

    println(people)

    var titleSeq = meetins
            .asSequence()
            .filter { println("filter($it)");it.title.startsWith("C") }
            .map { it.title }

    println(titleSeq)
}

class MeetingNew(val id: Int, val title: String) {
    val people = listOf(PersonNew("akash"), PersonNew("reddy"))
}

data class PersonNew(val name: String) {
    override fun toString(): String {
        return name
    }
}