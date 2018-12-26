@file:JvmName("DisplayFunctions")
package com.noclasses

fun main(args: Array<String>) {
    log(logLevel = 2, message = "Hello world")

    log(max(2, 4).toString())
}

@JvmOverloads
fun log(message: String, logLevel: Int = 1) : Boolean {
    println(message + logLevel)
    return true
}

fun max(a: Int, b: Int) : Int = if (a > b) a else b