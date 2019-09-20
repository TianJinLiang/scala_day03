package com.itheima.scala.matchdemo

object _06MatchDemo {
  def main(args: Array[String]): Unit = {
    // 1. 创建三个不同的List
    val list1 = List(0)
    val list2 = List(0, 1, 1, 2, 3, 3)
    val list3 = List(10, 11)

    // 2. 使用match..case来进行模式匹配
    list3 match {
      case 0 :: Nil => println("只有一个元素且元素为0的列表")
      case 0 :: tail => println("第一个元素为0且数量不固定的列表")
      case x :: y :: Nil => println(s"列表只有两个元素：${x}，${y}")
    }
  }
}
