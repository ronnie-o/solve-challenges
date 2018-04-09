package com.hcrank.algorithm.greedy

/**
  * Created by ronnie on 2018. 4. 9.
  * https://www.hackerrank.com/challenges/sherlock-and-the-beast/problem
  */
object SherlockAndTheBeast {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt
    (0 until t).foreach { _ =>
      val n = sc.nextInt
      val res = decentNumber(n)
      println(res)
    }
  }

  // timed out TT
  def decentNumber(num: Int): String = {
    val fives: List[Int] = Stream.from(0, 3).take(num / 3 + 1).toList // 0, 3, 6, 9
    val threes: List[Int] = Stream.from(0, 5).take(num / 5 + 1).toList // 0, 5, 10

    val list: List[Int] = threes.filter(t => fives.exists(f => t + f == num))
    if (list.isEmpty) "-1"
    else mkString(num - list.min, list.min)
  }

  def mkString(cnt5: Int, cnt3: Int): String = {
    val str5 = (0 until cnt5).foldLeft("")((s, _) => s + "5")
    (0 until cnt3).foldLeft(str5)((s, _) => s + "3")
  }
}
