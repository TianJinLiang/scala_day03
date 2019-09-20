package com.itheima.scala.matchdemo

import scala.io.StdIn

object _03MatchDemo {
  def main(args: Array[String]): Unit = {
    // 1. 从控制台读取一个数字
    val input = StdIn.readInt()

    // 2. 使用模式匹配匹配指定范围的数据，打印输出
    input match {
      case x if x >= 0 && x <= 3 => println("[0-3]")
      case x if x >= 4 && x <= 8 => println("[4-8]")
      case _ => println("未匹配")
    }
  }
}
