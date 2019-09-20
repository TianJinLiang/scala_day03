package com.itheima.scala.casedemo

object _02CaseClassDemo {
  // 1. 创建样例类，添加可变的成员
  case class Person(var name:String, var age:Int)

  // 2. 创建对象，修改年龄字段
  def main(args: Array[String]): Unit = {
    val zhangsan = Person("张三", 20)

    zhangsan.age = 23

    println(zhangsan)
  }
}
