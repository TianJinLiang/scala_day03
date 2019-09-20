package com.itheima.scala.oop

object _17ExtendsDemo {
  // 1. 创建一个Person类，定义成员变量/方法
  class Person {
    var name:String = _

    def getName() = this.name
  }

  // 2. 创建一个Student类，继承Person类
  class Student extends Person

  // 3. 创建Student类对象，访问成员
  def main(args: Array[String]): Unit = {
    val student = new Student

    student.name = "张三"

    println(student.getName())
  }
}
