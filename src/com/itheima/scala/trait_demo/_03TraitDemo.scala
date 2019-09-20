package com.itheima.scala.trait_demo

object _03TraitDemo {
  // 1. 创建特质，定义抽象方法
  trait Logger {
    def log(msg:String)
  }

  // 2. 定义单例对象，实现特质
  object ConsoleLogger extends Logger {
    override def log(msg: String): Unit = println("控制台消息:" + msg)
  }

  // 3. 调用单例对象的实现方法
  def main(args: Array[String]): Unit = {
    ConsoleLogger.log("你是一个好人！")
  }
}
