package com.hackerrank.day10

/**
  * Created by ronnie on 2017. 8. 17.
  */
// Day 10: Binary Numbers
object BinaryNumbers {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val max = maxConsecutive(0, 0, n)
    println(max) 
  }
  
  def maxConsecutive(acc: Int, max: Int, n: Int) :Int = {
    if (n == 0) max
    else if (n%2 == 1) maxConsecutive(acc + 1, Math.max(acc + 1, max), n/2)
    else maxConsecutive(0, Math.max(acc, max), n/2)
  }
}
