package com.itheima.scala.casedemo

object _09PartitionFunctionDemo {
  def main(args: Array[String]): Unit = {
    // 1. 定义一个列表 1-10
    val list = (1 to 10).toList

    // 2. 使用集合函数式操作来进行数据的转换
    val stringList = list.map {
      case x if x >= 1 && x <= 3 => "[1-3]"
      case x if x >= 4 && x <= 8 => "[4-8]"
      case _ => "(8,*)"
    }

    println(stringList)
  }
}
