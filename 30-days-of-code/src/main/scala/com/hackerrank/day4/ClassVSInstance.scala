package com.hackerrank.day4

/**
  * Created by ronnie on 2017. 8. 8.
  */
// Day 4: Class vs. Instance
object ClassVSInstance {
  def main(args: Array[String]) {
    val T = scala.io.StdIn.readInt()
    
    for (_ <- 1 to T) {
      val age = scala.io.StdIn.readInt()
      val p = new Person(age)
      p.amIOld()
      for (_ <- 1 to 3) {
        p.yearPasses()
      }
      p.amIOld()
      println()
    }
  }
}

class Person {

  var age: Int = 0

  def this(initialAge: Int) = {
    // Add some more code to run some checks on initialAge
    this()
    if (initialAge >= 0) this.age = initialAge
    else println("Age is not valid, setting age to 0.")
  }

  def amIOld(): Unit = {
    // Do some computations in here and print out the correct statement to the console
    if (this.age < 13) println("You are young.")
    else if (this.age >= 13 && this.age < 18) println("You are a teenager.")
    else println("You are old.")
  }

  def yearPasses(): Unit = {
    // Increment the age of the person in here
    this.age += 1
  }
}