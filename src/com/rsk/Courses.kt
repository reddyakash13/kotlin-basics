package com.rsk

class Course(val id: Int, val title: String) {}

object Courses {
    var allCourses = arrayListOf<Course>()

    fun initialize() {
        allCourses.add(Course(1, "Kotlin fundamental"))
    }
}