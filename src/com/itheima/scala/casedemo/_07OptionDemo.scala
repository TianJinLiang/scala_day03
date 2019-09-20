package com.itheima.scala.casedemo

object _07OptionDemo {
  // 1. 定义一个相除的方法，会使用Option来封装数据
  def div(x:Double, y:Double) = {
    if(y == 0) {
      // 表示没有数据
      None
    }
    else {
      val result = x / y
      // Some表示有数据
      Some(result)
    }
  }

  // 2. 可以使用模式匹配来判断是否有值
  def main(args: Array[String]): Unit = {
    val some = div(10.0, 2.0)
    val none = div(10.0, 0)

//    none match {
//      case Some(x) => println(x)
//      case None => println("除零异常")
//    }
    // 使用getOrElse来获取Option类型的值
    println(some.getOrElse(0))
    println(none.getOrElse(0))
  }
}
