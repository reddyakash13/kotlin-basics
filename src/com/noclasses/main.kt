package com.noclasses

import sun.plugin.dom.core.CoreConstants
import java.util.*

fun main(args: Array<String>) {
    println("Hello, world")

    var q:Question? = Question()

    q?.Answer = "42"

    q?.display()

    var message = if (q?.Answer == q?.CorrectAnswer) {
        "You are right"
    } else {
        "Try again"
    }

    println(message)

    q?.printResult()

    var number: Int? = try {
        Integer.parseInt(q?.Answer)
    } catch (e:NumberFormatException) {
        null
    }

    println("Number is $number")

    for (i in 1 until 10) {
        println(i)
    }

    var ages = TreeMap<String, Int>()
    ages["akash"] = 27
    ages["sudhakar"] = 26
    ages["ankith"] = 21

    for((name, age) in ages) {
        println("$name is $age old")
    }

    var numbers = listOf(1, 2, 3, 4, 5)

    for((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }
}

class Question {
    var Answer: String? = null
    val CorrectAnswer: String = "42"
    val Question: String = "What is the answer to life, universe and everything"

    fun display() {
        println("You said $Answer")
    }

    fun printResult() {
        when (Answer) {
            CorrectAnswer -> println("You are right")
            else -> println("Try again")
        }
    }
}