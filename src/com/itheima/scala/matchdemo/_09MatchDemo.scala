package com.itheima.scala.matchdemo

// 生成包含0-10数字的列表，使用模式匹配分别获取第一个、第二个元素
object _09MatchDemo {
  def main(args: Array[String]): Unit = {
    // 1. 生成0-10列表
    val list = (0 to 10).toList

    // 2. 在定义声明变量的时候，使用模式匹配，来匹配第一个、第二个元素
    val x :: y :: tail = list

    println(x, y)
  }
}
