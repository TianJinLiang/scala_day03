package com.itheima.scala.oop

object _21GetClassDemo {
  // 1. 创建类和子类
  class Person
  class Student extends Person

  // 2. 创建对象，判断对象的类型（isInstanceOf/getClass）
  def main(args: Array[String]): Unit = {
    val student:Person = new Student

    if(student.isInstanceOf[Person]) {
      println("isInstanceOf:student是Person类型")
    }
    else {
      println("isInstanceOf:student不是Person类型")
    }

    println("-" * 10)

    // 使用getClass获取对象的类型
    // 使用classOf获取类的类型
    if(student.getClass == classOf[Person]) {
      println("getClass/classOf：student是Person类型")
    }
    else {
      println("getClass/classOf：student不是Person类型")
    }

    if(student.getClass == classOf[Student]) {
      println("getClass/classOf: student是Student类型")
    }
    else {
      println("getClass/classOf: student不是Student类型")
    }
  }
}
