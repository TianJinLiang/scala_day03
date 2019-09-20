package com.itheima.scala.oop

object _03ClassObjectDemo {
  // 1. 定义类
  class Person {
    // 2. 定义成员变量
    var name:String = ""
    var age:Int = 0

  }

  def main(args: Array[String]): Unit = {
    // 3. 创建对象，访问成员、设置成员变量的值
    val person = new Person

    person.name = "张三"
    person.age = 20

    println(person.name)
    println(person.age)
  }
}
