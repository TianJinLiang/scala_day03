package com.itheima.scala.oop

object _10ObjectDemo {
  // 1. 创建一个单例对象, 定义成员方法
  object PrintUtil {
    // 在object中定义成员方法与定义方法一样
    def printSpliter() = {
      println("-" * 15)
    }
  }

  // 2. 调用单例对象的成员方法
  def main(args: Array[String]): Unit = {
    PrintUtil.printSpliter()
  }
}
