package com.hcrank.algorithm

/**
  * Created by ronnie on 2017. 11. 26.
  * https://www.hackerrank.com/challenges/camelcase
  */
object Camelcase {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val s = sc.next()

    val count = if (s.length == 1) 1 else { s.filter(c => c.isUpper).length + 1 }
    println(count)
  }
}
