package com.hcrank.algorithm.search

/**
  * Created by ronnie on 2018. 2. 7.
  * https://www.hackerrank.com/challenges/sherlock-and-array/problem
  */
object SherlockAndArray {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val T = sc.nextInt()
    
    for (_ <- 0 until T) {
      val n = sc.nextInt()
      // 입력 값을 받으면서 동시에 sum을 구해 index와 함께 저장 (left)
      var sumLeft = 0
      val leftMap = scala.collection.mutable.HashMap(0 -> 0)
      val A: Seq[Int] = for (i <- 0 until n) yield {
        val a = sc.nextInt()
        sumLeft += a
        leftMap.put(i + 1, sumLeft)
        a
      }
      //println(leftMap)

      // 입력 받은 값을 역으로 순회하면서 sum을 구해 index와 함께 저장 (right)
      var sumRight = 0
      val rightMap = scala.collection.mutable.HashMap(A.size - 1 -> 0)
      for (i <- A.size - 1 until 0 by -1) {
        sumRight += A(i)
        rightMap.put(i - 1, sumRight)
      }
      //println(rightMap)

      // 같은 인덱스의 sum 값이 같은게 있으면 YES 없으면 NO
      if (A.indices.exists(i => leftMap.get(i) == rightMap.get(i))) println("YES")
      else println("NO")
    }
  }
}
