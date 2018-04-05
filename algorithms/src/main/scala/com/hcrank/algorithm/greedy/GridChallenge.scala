package com.hcrank.algorithm.greedy

/**
  * Created by ronnie on 2018. 4. 5.
  * https://www.hackerrank.com/challenges/grid-challenge/problem
  */
object GridChallenge {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt()
    for (_ <- 0 until t) {
      val n = sc.nextInt()
      val grid = new Array[String](n)
      for (i <- 0 until n) {
        val s = sc.next()
        grid(i) = s.sortWith(_ < _)
      }
      val result = gridChallenge(grid)
      println(result)
    }
  }

  def gridChallenge(grid: Array[String]): String = {
    for (i <- grid.indices) {
      for (j <- 0 until grid.length - 1) {
        if (grid(j).charAt(i) > grid(j + 1).charAt(i)) {
          return "NO"
        }
      }
    }
    "YES"
  }
}
