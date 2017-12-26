package com.hcrank.algorithm

/**
  * Created by ronnie on 2017. 12. 18.
  * https://www.hackerrank.com/challenges/bear-and-steady-gene/problem
  */
object BearAndSteadyGene {
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
    val sc = new java.util.Scanner(System.in)
    val n: Int = sc.nextLine().toInt
    val s = sc.nextLine()

    val steady: Int = n / 4
    var a: List[Int] = Nil
    var c: List[Int] = Nil
    var g: List[Int] = Nil
    var t: List[Int] = Nil

    for (i <- s.indices) {
      val sc = s.charAt(i)
      sc match {
        case 'A' => a = a :+ i
        case 'C' => c = c :+ i
        case 'G' => g = g :+ i
        case 'T' => t = t :+ i
      }
    }
    var aRange: List[(Int, Int)] = makeRange(a, steady)
    var cRange: List[(Int, Int)] = makeRange(c, steady)
    var gRange: List[(Int, Int)] = makeRange(g, steady)
    var tRange: List[(Int, Int)] = makeRange(t, steady)

    var merged = merge(aRange, cRange)
    merged = merge(merged, gRange)
    merged = merge(merged, tRange)
    if (merged.isEmpty)
      println("0")
    else 
      println(merged.map(e => e._2 - e._1 + 1).min)
  }

  def merge(left: List[(Int, Int)], right: List[(Int, Int)]): List[(Int, Int)] = {
    if (left.isEmpty) {
      right
    } else if (right.isEmpty) {
      left
    } else {
      left.flatMap(l => right.map(r => (Math.min(l._1, r._1), Math.max(l._2, r._2))))
    }
  }

  def makeRange(x: List[Int], steady: Int): List[(Int, Int)] = {
    var range: List[(Int, Int)] = Nil
    if (x.length > steady) {
      val x1 = x.length - steady
      for (i <- 0 to steady) {
        val a2 = x.slice(i, i + x1)
        range = range :+ (a2.head, a2.last)
      }
    }
    range
  }
}
