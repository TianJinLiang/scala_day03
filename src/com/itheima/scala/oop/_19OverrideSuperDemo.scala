package com.itheima.scala.oop

object _19OverrideSuperDemo {
  // 1. 创建Person父类，定义成员字段、成员方法
  class Person {
    val name:String = ""

    def getName(): String = this.name
  }

  // 2. 创建Student子类，重写成员/重写方法
  class Student extends Person {
    // 重写字段
    override val name: String = "Student"

    // 重写方法
    override def getName(): String = "hello, " + super.getName()
  }

  // 3. 创建子类对象，访问重写的成员
  def main(args: Array[String]): Unit = {
    val student = new Student

    println(student.name)
    println(student.getName())
  }
}
