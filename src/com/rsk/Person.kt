package com.rsk

fun main(args: Array<String>) {
    val kevin = Student("akash", "reddy",1)
    println(kevin.id)
}
abstract class Person(var firstName: String, var lastName: String) {

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress() : String
}

class Student(firstName: String, lastName: String,_id: Int, val tutor: String = ""): Person(firstName, lastName) {
    val id: Int

    init {
        id = _id
    }

    override fun getAddress(): String {
        return "newyork"
    }

    override fun getName() : String { return ""}
}