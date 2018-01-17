package com.hcrank.algorithm.sorting

import scala.collection.mutable.ListBuffer


object QSort {
  def qsort(xs: List[(Int, ListBuffer[String])]): List[(Int, ListBuffer[String])] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      qsort(xs.filter(x => pivot._1 > x._1)) ++
        xs.filter(x => pivot._1 == x._1) ++
        qsort(xs.filter(x => pivot._1 < x._1))
    }
  }

  def qsort(xs: ListBuffer[String]): ListBuffer[String] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      qsort(xs.filter(x => pivot > x)) ++
        xs.filter(x => pivot == x) ++
        qsort(xs.filter(x => pivot < x))
    }
  }
}