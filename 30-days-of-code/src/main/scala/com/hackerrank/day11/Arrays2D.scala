package com.hackerrank.day11
import scala.collection.immutable.Seq

/**
  * Created by ronnie on 2017. 8. 17.
  */
// Day 11: 2D Arrays
object Arrays2D {
  def main(args: Array[String]): Unit = {
    val A: Array[Array[Int]] = (1 to 6).map { _ =>
      val line = scala.io.StdIn.readLine()
      line.split(" ").map(s => s.toInt)
    }.toArray

    val max = (0 to 3).flatMap { i =>
      (0 to 3).map { j =>
        sumCase(A, i, j)
      }
    }.max
    println(max)
  }

  def sumCase(A: Array[Array[Int]], i: Int, j: Int): Int = {
    val sum = (i to i + 2).flatMap { m =>
      (j to j + 2).map { n =>
        A(n)(m)
      }
    }.sum
    sum - A(j+1)(i) - A(j+1)(i+2)
  }
}
