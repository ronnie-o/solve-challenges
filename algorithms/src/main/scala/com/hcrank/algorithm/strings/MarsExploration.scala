package com.hcrank.algorithm.strings

/**
  * Created by ronnie on 2017. 11. 26.
  * https://www.hackerrank.com/challenges/mars-exploration
  */
object MarsExploration {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var S = sc.next()

    val SOS = "SOS"
    val changed = (0 until S.length)
      .filterNot(i => S.charAt(i) == SOS.charAt(i % 3))
      .length
    println(changed)
  }
}
