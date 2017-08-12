package com.hackerrank.day9

/**
  * Created by ronnie on 2017. 8. 12.
  */
// Day 9: Recursion
object Recursion {
  def main(args: Array[String]): Unit = {
    val N = scala.io.StdIn.readInt()
    println(factorial(N))
  }

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }
}
