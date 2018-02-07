package com.hcrank.algorithm.search

/**
  * Created by ronnie on 2018. 2. 7.
  * https://www.hackerrank.com/challenges/sherlock-and-array/problem
  */
object SherlockAndArray {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val T = sc.nextInt()
    val a0 = 0
    
    for (_ <- 0 until T) {
      val n = sc.nextInt()
      val A: Seq[Int] = for (_ <- 0 until n) yield sc.nextInt()
      println(yesOrNo(A))
    }
  }
  
  def yesOrNo(A: Seq[Int]): String = {
    for(i <- A.indices) {
      val left = A.take(i)
      val right = A.drop(i + 1)
      if (left.sum == right.sum) return "YES"
    }
    "NO"
  }
}
