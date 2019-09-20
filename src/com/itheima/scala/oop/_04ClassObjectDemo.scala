package com.itheima.scala.oop

object _04ClassObjectDemo {
  // 1. 创建一个Person类，添加成员变量
  class Person {
    var name:String = _
    var age:Int = _
  }

  def main(args: Array[String]): Unit = {
    // 2. 创建Person对象
    val person = new Person

    // 3. 设置Person对象的成员变量值、获取打印成员变量
//    person.name = "张三"
//    person.age = 20

    println(person.name)
    println(person.age)

  }
}
