package com.itheima.scala.oop

object _20IsInstanceOfDemo {
  // 1. 创建Person类
  class Person
  // 2. 创建Student子类，从Person类继承
  class Student extends Person

  // 3. 创建对象，判断类型
  def main(args: Array[String]): Unit = {
    val student:Person = new Student

    if(student.isInstanceOf[Person]) {
      // 是Student类型
//      val student1 = student.asInstanceOf[Student]
//      println(student1)
      println("这是相关实例")
    }
    else {
      // 不是Student类型
      println("不是Student类型")
    }
  }
}
