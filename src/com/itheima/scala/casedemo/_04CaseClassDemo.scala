package com.itheima.scala.casedemo

object _04CaseClassDemo {
  // 1. 创建样例类
  case class Person(name:String, age:Int)

  // 2. 创建两个对象，打印哈希值
  def main(args: Array[String]): Unit = {
    val lisi1 = Person("李四", 21)
    val lisi2 = Person("李四", 22)

    println(lisi1.hashCode())
    println(lisi2.hashCode())
  }
}
