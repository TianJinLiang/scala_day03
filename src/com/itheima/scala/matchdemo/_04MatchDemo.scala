package com.itheima.scala.matchdemo

object _04MatchDemo {
  // 1. 创建两个样例类
  case class Person(name:String, age:Int)
  case class Order(id:String)

  def main(args: Array[String]): Unit = {
    // 2. 创建样例类对象，并赋值为Any类型
    val zhangsan:Any = Person("张三", 20)
    val order1:Any = Order("001")

    // 3. 使用match...case表达式来进行模式匹配
    // 获取样例类中成员变量
    order1 match {
      case Person(name, age) => println(s"姓名：${name} 年龄：${age}")
      case Order(id1) => println(s"ID为：${id1}")
      case _ => println("未匹配")
    }
  }
}
