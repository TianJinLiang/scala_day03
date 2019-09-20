package com.itheima.scala.casedemo

object _03CaseClassDemo {
  // 1. 创建一个样例类
  case class Person(name:String, age:Int)

  // 2. 创建两个样例类的对象，比较是否相等
  def main(args: Array[String]): Unit = {
    val lisi1 = Person("李四", 21)
    val lisi2 = Person("李四", 21)

    // 比较两个对象是否是同一个对象
    println(lisi1.eq(lisi2))
    // 比较两个对象是否相等
    println(lisi1 == lisi2)
  }
}
