package com.itheima.scala.oop

object _14ObjectDemo {
  // 1. 创建一个伴生类
  class CustomerService() {
    def save() = {
      println(CustomerService.SERVICE_NAME + ":保存客户")
    }
  }

  // 2. 创建一个伴生对象
  object CustomerService {
    // 定义一个私有变量
    // 服务类的名称
    private val SERVICE_NAME = "CustomerService"
  }

  // 3. 创建对象，调用方法
  def main(args: Array[String]): Unit = {
    val service = new CustomerService

    service.save()
  }
}
