package com.rsk

fun main(args: Array<String>) {
    val kevin = Student("akash", "reddy",1)
    println(kevin.id)

    Student.createPostgraduate("akash")
    Student.createUndergraduate("reddy")
}

class Program {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val kevin = Student("akash", "reddy",1)
            println(kevin.id)
        }
    }
}
abstract class Person(var firstName: String, var lastName: String) {

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress() : String
}

open class Student(firstName: String, lastName: String,_id: Int, val tutor: String = ""): Person(firstName, lastName) {
    val id: Int

    init {
        id = _id
    }

    fun enrole(courseName: String) {
        Courses.allCourses.filter { it.title == courseName }
                .firstOrNull()
    }
    override fun getAddress(): String {
        return "newyork"
    }

    override fun getName() : String { return ""}

    companion object : XmlSerializer<Student> {
        override fun toXml(item: Student) {

        }

        fun createUndergraduate(name: String) = Undergraduate(name)

        fun createPostgraduate(name: String) = Postgraduate(name)
    }
}

class Undergraduate(firstName: String) : Student(firstName, "", 1) {

}

class Postgraduate(firstName: String) : Student(firstName, "", 1) {

}

interface XmlSerializer<T> {
    fun toXml(item: T)
}