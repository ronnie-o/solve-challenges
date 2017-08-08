package com.hackerrank.day2

/**
  * Created by ronnie on 2017. 8. 8.
  */
object Operators {
  def main(args: Array[String]): Unit = {
    val mealCost = scala.io.StdIn.readDouble()
    val tipPercent = scala.io.StdIn.readInt()
    val taxPercent = scala.io.StdIn.readInt()

    val tip = mealCost * (tipPercent / 100.0)
    val tax = mealCost * (taxPercent / 100.0)
    val totalCost = mealCost + tip + tax

    println(s"The total meal cost is ${Math.round(totalCost)} dollars.")
  }
}
