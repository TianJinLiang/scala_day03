package com.itheima.scala.oop

object _24AnonymousDemo {
  // 1. 创建抽象类
  abstract class Person {
    // 定义抽象方法
    def sayHello()
  }

  // 2. 直接使用匿名内部类来创建对象
  def main(args: Array[String]): Unit = {
    val person = new Person {
      override def sayHello(): Unit = println("hello")
    }
    person.sayHello()
  }
}
