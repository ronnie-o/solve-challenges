package com.hackerrank.day5

/**
  * Created by ronnie on 2017. 8. 8.
  */
// Day 5: Loops
object Loops {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    (1 to 10).foreach(i => println(s"$n x $i = ${n * i}"))
  }
}
