package com.hcrank.algorithm.sorting

import scala.collection.immutable.Seq

/**
  * Created by ronnie on 2017. 12. 27.
  * https://www.hackerrank.com/challenges/closest-numbers/problem
  */
object ClosestNumbers {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val N: Int = sc.nextLine().toInt
    val line = sc.nextLine()
    val a = line.split(" ").map(s => s.toInt).sortWith((a, b) => a < b)
    val tuples: Seq[(Int, Int, Int)] = for (i <- 0 until a.length - 1) yield (a(i), a(i + 1), Math.abs(a(i) - a(i + 1)))
    val sorted = tuples.sortWith((ai, aj) => ai._3 < aj._3)
    val res = sorted.takeWhile(e => sorted.head._3 == e._3)
      .map(e => e._1 + " " + e._2)
      .mkString(" ")
    println(res)
  }

}
