package com.hcrank.algorithm.sorting

import java.util.Scanner

/**
  * Created by ronnie on 2017. 12. 28.
  * https://www.hackerrank.com/challenges/countingsort4/problem
  */
object TheFullCountingSort {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n: Int = sc.nextLine().toInt
    val arr: Seq[(Int, String)] = (0 until n).map(i => {
      val lines: Array[String] = sc.nextLine().split(" ")
      val x = lines(0).toInt
      val s = if (i < n / 2) "-" else lines(1)
      (x, s)
    })

    val result: String = arr.sortWith(_._1 < _._1).map(_._2).mkString(" ")
    println(result)
  }
}
