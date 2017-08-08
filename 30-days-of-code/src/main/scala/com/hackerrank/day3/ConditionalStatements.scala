package com.hackerrank.day3

/**
  * Created by ronnie on 2017. 8. 8.
  */
// Day 3: Intro to Conditional Statements
object ConditionalStatements {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    var N = sc.nextInt()

    if (N % 2 == 1) println("Weird") 
    else if ((2 to 5).contains(N)) println("Not Weird")
    else if ((6 to 20).contains(N)) println("Weird")
    else if (N > 20) println("Not Weird")
  }
}
