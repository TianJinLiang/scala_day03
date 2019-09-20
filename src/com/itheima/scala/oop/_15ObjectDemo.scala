package com.itheima.scala.oop

object _15ObjectDemo {
  // 1. 创建Person类，定义一个private[this]成员变量
  class Person(private/*[this]*/ var name:String)

  // 2. 创建Person伴生对象，在伴生对象中测试访问成员变量
  object Person {
    // 通过在伴生对象中去访问Person类的name字段
    def printPerson(p:Person) = println(p.name)
  }

  // 3. 定义一个main方法，调用伴生对象的方法
  def main(args: Array[String]): Unit = {
    Person.printPerson(new Person("张三"))
  }
}
