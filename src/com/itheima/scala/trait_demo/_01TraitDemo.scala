package com.itheima.scala.trait_demo

object _01TraitDemo {
  // 1. 创建一个特质
  trait Logger {
    // 可以在特质中定义抽象方法:log
    def log(msg:String)
  }

  // 2. 创建一个实现类，继承特质
  class ConsoleLogger extends Logger {
    override def log(msg: String): Unit = println("控制台消息:" + msg)
  }

  // 3. 创建实现类的对象，调用实现方法
  def main(args: Array[String]): Unit = {
    val logger = new ConsoleLogger

    logger.log("NullPointer Exception..")
  }
}
