package com.hcrank.algorithm.sorting

/**
  * Created by ronnie on 2017. 12. 29.
  * https://www.hackerrank.com/challenges/find-the-median/problem
  */
object FindTheMedian {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val arr: Array[Int] = (0 until n).toArray.map(_ => sc.nextInt())
    val result = findMedian(arr, n)
    println(result)
  }

  def findMedian(arr: Array[Int], n: Int): Int = {
    scala.util.Sorting.quickSort(arr)
    arr(n / 2)
  }
}
