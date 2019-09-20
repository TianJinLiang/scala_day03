package com.itheima.scala.trait_demo

object _10TraitDemo {

  // 1. 创建实现类
  class MyUtils {
    def printMsg(msg:String) = println(msg)
  }

  // 2. 创建trait，从类中继承
  trait Logger extends MyUtils {
    def log(msg:String) = printMsg(msg)
  }

  // 3. 创建一个实现类，继承trait
  class Person(var name:String = "") extends Logger {
    def sayHello() = log(name + ":你好！")
  }

  // 4. 创建实现类的对象，调用方法测试
  def main(args: Array[String]): Unit = {
    val zhangsan = new Person("张三")
    zhangsan.sayHello()
  }
}
