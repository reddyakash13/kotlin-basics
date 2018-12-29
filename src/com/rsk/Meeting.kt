package com.rsk

import java.util.*

class Meeting {
    var Title: String = ""
    var When: Date = Date()
    val Who = mutableListOf<String>()

    fun create(){}
}

fun main(args: Array<String>) {
    val m = Meeting()
    with(m) {
        Title = "Board meeting"
        When = Date(2019,1,1)
        Who.add("Akash")
    }

    m.apply {
        Title = "Board meeting"
        When = Date(2019,1,1)
        Who.add("Akash")
    }.create()

}