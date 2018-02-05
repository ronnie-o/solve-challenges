package com.hcrank.algorithm.sorting

/**
  * Created by ronnie on 2018. 1. 26.
  * https://www.hackerrank.com/challenges/lilys-homework/problem
  */
object LilysHomework {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    var map = Map.empty[Int, Int]
    var origin = List.empty[Int]
    for (i <- 0 until n) {
      val el = sc.nextInt()
      map = map + (el -> i)
      origin = origin :+ el
    }
    val result = lilysHomework(origin, map)
    println(result)
  }

  def lilysHomework(origin: List[Int], map: Map[Int, Int]): Int = {
    val sorted: Array[Int] = origin.toArray
    scala.util.Sorting.quickSort(sorted)

    val countA: Int = getSwapCount(origin.toArray, map, sorted)
    val countB: Int = getSwapCount(origin.toArray, map, sorted.reverse)
    scala.math.min(countA, countB)
  }

  def getSwapCount(base: Array[Int], map: Map[Int, Int], sorted: Array[Int]): Int = {
    var swapCount = 0
    for (i <- base.indices) {
      val j: Int = map(base(i))
      if (i != j) {
        val temp = base(i)
        base(i) = base(j)
        base(j) = temp
        swapCount += 1
      }
    }
    swapCount
  }
}