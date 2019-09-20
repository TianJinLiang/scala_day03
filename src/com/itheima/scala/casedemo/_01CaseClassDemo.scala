package com.itheima.scala.casedemo

object _01CaseClassDemo {
  // 1. 定义样例类，定义成员变量
  case class Person(name:String, age:Int)

  // 2. 创建样例类的对象
  def main(args: Array[String]): Unit = {
    val zhangsan = Person("张三", 20)

    // 样例中定义的成员默认是：val类型
    // zhangsan.age = 23

    println(zhangsan)
  }
}
