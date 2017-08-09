package com.hackerrank.day6

/**
  * Created by ronnie on 2017. 8. 9.
  */
// Day 6: Let's Review
object Review {
  def main(args: Array[String]): Unit = {
    val T = scala.io.StdIn.readInt()
    val S = (1 to T).map { _ => scala.io.StdIn.readLine() }
    S.foreach { s =>
      val even = filter(s, i => i % 2 == 0)
      val odd = filter(s, i => i % 2 == 1)
      println(s"$even $odd")
    }
  }
  
  def filter(str: String, f: Int => Boolean): String = {
    str.toCharArray
      .zipWithIndex
      .filter(a => f(a._2))
      .map(a => a._1).mkString
  }
}
