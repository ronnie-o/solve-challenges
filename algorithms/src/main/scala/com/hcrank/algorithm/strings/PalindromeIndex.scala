package com.hcrank.algorithm.strings

/**
  * Created by ronnie on 2017. 12. 11.
  * https://www.hackerrank.com/challenges/palindrome-index/problem
  */
object PalindromeIndex {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val q = sc.nextInt()
    (0 until q).foreach(_ => {
      val input = sc.next()
      val index = palindromeIndex(input.toCharArray, -1)
      println(index)
    })
  }

  def palindromeIndex(s: Array[Char], pos: Int): Int = {
    if (s.length < pos)
      -1
    else if (isPalindrome(s, pos))
      pos
    else {
      palindromeIndex(s, pos + 1)
    }
  }
  
  def isPalindrome(target: Array[Char], pos: Int): Boolean = {
    var front = 0
    var rare = target.length - 1
    val half = target.length / 2
    while (front < half) {
      if (front == pos)
        front = front + 1
      else if (rare == pos)
        rare = rare - 1
      
      if (target(front) != target(rare))
        return false
      else {
        front = front + 1
        rare = rare - 1
      }
    }
    true
  }
}
