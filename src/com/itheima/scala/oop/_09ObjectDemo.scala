package com.itheima.scala.oop

object _09ObjectDemo {
  // 1. 创建单例对象
  object Dog {
    // 定义了一个单例对象的成员
    // 类似于Java中static变量
    val LEG_NUM = 4
  }

  // 2. 访问单例对象中的成员变量
  def main(args: Array[String]): Unit = {
    println(Dog.LEG_NUM)
  }
}
