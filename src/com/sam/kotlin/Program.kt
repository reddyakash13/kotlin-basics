package com.sam.kotlin

import com.sam.java.Created
import com.sam.java.User

fun main(args: Array<String>) {
    var user = User("akash")

    var count = 0

    var eventListener = Created({ println("User $it has been created ${++count} times") } )

    user.create(eventListener)
    user.create{ println("User $it has been created ${++count} times")}
}