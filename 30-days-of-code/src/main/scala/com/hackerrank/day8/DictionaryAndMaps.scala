package com.hackerrank.day8

/**
  * Created by ronnie on 2017. 8. 12.
  */
// Day 8: Dictionaries and Maps
object DictionaryAndMaps {

  def main(args: Array[String]): Unit = {
    val N = scala.io.StdIn.readInt()

    val phoneBook: Map[String, Long] = (1 to N).map(_ => scala.io.StdIn.readLine().split(" "))
      .map(ar => (ar(0), ar(1).toLong))
      .toMap

    (1 to N).foreach(_ => {
      Option(scala.io.StdIn.readLine()) match {
        case Some(query) =>
          val result = phoneBook.get(query) match {
            case Some(phone) => s"$query=$phone"
            case None => "Not found"
          }
          println(result)
        case None => 
      }
    })
  }
}
