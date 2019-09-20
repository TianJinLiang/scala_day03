package com.itheima.scala.casedemo

object _05CaseClassDemo {
  // 1. 创建样例类
  case class Person(name:String, age:Int)

  // 2. 创建样例类对象，使用copy方式来创建一个新的对象
  def main(args: Array[String]): Unit = {
    val lisi = Person("李四", 21)

    val wangwu = lisi.copy(name = "王五")

    println(wangwu)
  }
}
