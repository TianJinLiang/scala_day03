package com.itheima.scala.oop

object _18ExtendsDemo {
  // 1. 创建一个Person类，定义成员变量/方法
  class Person {
    var name:String = _

    def getName() = this.name
  }

  // 2. 创建Student单例对象，从Person类继承
  object Student extends Person

  // 3. 设置、访问单例对象中的成员
  def main(args: Array[String]): Unit = {
    Student.name = "张三"
    println(Student.getName())
  }
}
