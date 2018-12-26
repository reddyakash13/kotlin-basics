package com.noclasses

import java.math.BigInteger

fun main(args: Array<String>) {
    println(fib(100000, BigInteger.ONE, BigInteger.ZERO))
}

tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fib(n-1, a+b, a)
}