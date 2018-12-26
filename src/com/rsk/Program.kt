package com.rsk

fun main(args: Array<String>) {
    var s1 = StudentNew(1, "akash")
    var s2 = StudentNew(1, "akash")

    println(s1)
    if (s1 == s2) {
        println("Both are equal")
    } else {
        println("Not equal")
    }

    var s3 = s1.copy(name = "robert")
    println(s3)
}
data class StudentNew(val id: Int, val name: String) {

}