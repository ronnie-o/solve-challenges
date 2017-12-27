package com.hcrank.algorithm.strings

/**
  * Created by ronnie on 2017. 11. 26.
  * https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
  */
object HackerrankInAString {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val q = sc.nextInt()
    
    var a0 = 0
    while (a0 < q) {
      var s = sc.next()

      // your code goes here
      val hackerrank = "hackerrank"
      var pos = 0
      val result: String = s.filter(c => {
        if (c == hackerrank.charAt(pos)) {
          pos += 1
          true
        } else
          false
      })
      if (result == hackerrank) println("YES") else println("NO")
      a0 += 1
    }
  }
}
