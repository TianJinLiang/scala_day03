package com.itheima.scala.trait_demo

object _09TraitDemo {
  // 1. 创建一个父特质，在构造器中打印一句话
  trait Logger {
    println("执行Logger构造器")
  }

  // 2. 创建两个特质，继承父特质，在构造器中打印一句话
  trait MyLogger extends Logger {
    println("执行MyLogger构造器")
  }

  trait TimeLogger extends Logger {
    println("执行TimeLogger构造器")
  }

  // 3. 定义一个父类
  class Person {
    println("执行Person类构造器")
  }

  // 4. 定义一个子类，继承父类，继承特质
  class Student extends Person with MyLogger with TimeLogger {
    println("执行Student子类构造器")
  }

  // 5. 创建子类对象，查看构造的顺序
  def main(args: Array[String]): Unit = {
    new Student
  }
}
