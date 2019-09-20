package com.itheima.scala.matchdemo

object _02MatchDemo {
  def main(args: Array[String]): Unit = {
    // 1. 定义Any类型的变量
    // 分别赋值："hadoop"、1、1.0
    val a:Any = "hadoop"
//    val a:Any = 1
//    val a:Any = 1.0
//    val a:Any = null // Null类型的实例

    // 2. 使用模式匹配来匹配数据类型
    a match {
      case _:String => println(s"字符串类型")
      case x:Int => println(s"${x}是整形")
      case x:Double => println(s"${x}是双精度浮点型")
      case _ => println("未匹配")
    }
  }
}
