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
      val res = decentNumber(n, 0)
      println(res)
    }
  }

  def decentNumber(num: Int, i: Int): String = {
    println(s"num=$num,i=$i")
    if (num < 0) "-1"
    else if (num % 3 == 0) mkString(num, 5 * i)
    else if (num == 0) mkString(0, 5 * i)
    else decentNumber(num - 5, i + 1)
    
  }

  def mkString(cnt5: Int, cnt3: Int): String = {
    if (cnt5 == 0 && cnt3 == 0) "-1"
    else "5" * cnt5 + "3" * cnt3
  }
}
