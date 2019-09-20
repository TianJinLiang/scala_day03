package com.itheima.scala.oop

object _05ClassObjectDemo {
  // 1. 创建一个Customer类
  class Customer {
    // 1.1 定义成员变量
    var name:String = _
    var sex:String = _

    // 1.2 定义成员方法
    def printHello(msg:String) = println(msg)
  }

  def main(args: Array[String]): Unit = {
    // 2. 创建一个Customer对象，调用成员方法
    val customer = new Customer

    customer.printHello("你好")
  }
}
