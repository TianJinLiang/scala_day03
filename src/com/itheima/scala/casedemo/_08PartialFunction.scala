package com.itheima.scala.casedemo

object _08PartialFunction {
  def main(args: Array[String]): Unit = {
    // 1. 定义一个偏函数
    val partialFunction:PartialFunction[Int, String] = {
      case 1 => "一"
      case 2 => "二"
      case 3 => "三"
      case _ => "其他"
    }

    // 2. 调用偏函数
    println(partialFunction(1))
    println(partialFunction(2))
    println(partialFunction(3))
    println(partialFunction(4))
  }
}
