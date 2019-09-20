package com.itheima.scala.matchdemo

object _05MatchDemo {
  def main(args: Array[String]): Unit = {
    // 1. 定义三个数组，用于匹配
    val array1 = Array(1, 2, 3)
    val array2 = Array(0)
    val array3 = Array(0, 1, 2, 3, 4, 5)

    // 2. 使用match...case 来进行匹配
    array3 match {
      case Array(1, x, y) => println(s"匹配三个元素的数组，第一个元素为1，${x}, ${y}")
      case Array(0) => println(s"匹配一个元素的数组，元素值为0")
      case Array(0, _*) => println("第一个元素为0，数量不固定的数组")
    }
  }
}
