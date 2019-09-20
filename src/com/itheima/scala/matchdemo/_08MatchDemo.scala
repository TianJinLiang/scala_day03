package com.itheima.scala.matchdemo

// 生成包含0-10数字的数组，使用模式匹配分别获取第二个、第三个、第四个元素
object _08MatchDemo {
  def main(args: Array[String]): Unit = {
    // 1. 生成数组0-10
    val array = (0 to 10).toArray

    // 2. 模式匹配获取第二个、三个、四个
    val Array(_, x, y, z, _*) = array

    println(x, y, z)
  }
}
