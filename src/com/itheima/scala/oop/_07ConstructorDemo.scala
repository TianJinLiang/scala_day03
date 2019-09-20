package com.itheima.scala.oop

object _07ConstructorDemo {

  // 1. 创建Person类，使用主构造器来进行字段定义和默认值赋值
  class Person(var name:String = "", var age:Int = 0) {
    println("调用主构造器")
  }

  def main(args: Array[String]): Unit = {
    // 2. 使用主构造器来创建对象
    val zhangsan = new Person("张三", 20)
    println(zhangsan.name)
    println(zhangsan.age)

    println("---")

    val empty = new Person
    println(empty.name)
    println(empty.age)

    println("---")

    val man40 = new Person(age = 40)
    println(man40.name)
    println(man40.age)
  }
}
