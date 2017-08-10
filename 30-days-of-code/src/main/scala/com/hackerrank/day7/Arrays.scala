package com.hackerrank.day7

/**
  * Created by ronnie on 2017. 8. 10.
  */
// Day 7: Arrays
object Arrays {
  def main(args: Array[String]): Unit = {
    val N = scala.io.StdIn.readInt()
    val A = scala.io.StdIn.readLine()
    val res = A.split(" ", N)
      .map(a => a.toInt)
      .reverse
      .mkString(" ")
    println(res)
  }
}
