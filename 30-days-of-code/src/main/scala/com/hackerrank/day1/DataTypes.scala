package com.hackerrank.day1

/**
  * Created by ronnie on 2017. 8. 8.
  */
object DataTypes {
  def main(args: Array[String]) {
    val i = 4
    val d = 4.0
    val s = "HackerRank "

    // Read values of another integer, double, and string variables
    // Note use scala.io.StdIn to read from stdin
    val myInt = scala.io.StdIn.readInt()
    val myDouble = scala.io.StdIn.readDouble()
    val myString = scala.io.StdIn.readLine()

    // Print the sum of both the integer variables
    println(i + myInt)

    // Print the sum of both the double variables
    println(d + myDouble)

    // Concatenate and print the string variables
    // The 's' variable above should be printed first.
    println(s + myString)
  }
}
