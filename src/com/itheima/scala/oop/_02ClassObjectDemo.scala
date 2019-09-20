package com.itheima.scala.oop

object _02ClassObjectDemo {

  // 省略类后面的{}
  class Person

  def main(args: Array[String]): Unit = {
    // 类的构造器的参数为空，省略后面的()
    val person = new Person
    println(person)
  }
}
