package com.hcrank.algorithm.sorting

import scala.collection.mutable
import scala.collection.mutable.ListBuffer


/**
  * Created by ronnie on 2018. 1. 15.
  * https://www.hackerrank.com/challenges/big-sorting/problem
  */
object BigSorting {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val arrMap = mutable.HashMap.empty[Int, ListBuffer[String]]
    for (_ <- 0 until n) {
      val el = sc.next
      val len = el.length
      arrMap.getOrElseUpdate(len, ListBuffer.empty).+=(el)
    } //arrMap.foreach(a => println(a._1, a._2))

    bigSorting(arrMap)
  }

  def bigSorting(arrMap: mutable.HashMap[Int, ListBuffer[String]]): Unit = {
    val sortedLen = QSort.qsort(arrMap.toList)
    sortedLen.foreach { sl => 
      val sortedElements: ListBuffer[String] = QSort.qsort(sl._2)
      sortedElements.foreach{ el =>
        println(el)
      }
    }
  }
}
