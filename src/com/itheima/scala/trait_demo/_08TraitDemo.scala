package com.itheima.scala.trait_demo

object _08TraitDemo {

  // 1. 定义一个trait(HandlerTrait)
  trait HandlerTrait {
    def handle(data:String) = {
      println("处理支付数据...")
    }
  }

  // 2. 定义两个trait（数据校验、签名校验）
  trait DataValidateTrait extends HandlerTrait {
    override def handle(data: String): Unit = {
      println("数据校验...")
      super.handle(data)
    }
  }

  trait SignatureValidateTrait extends HandlerTrait {
    override def handle(data: String): Unit = {
      println("签名校验...")
      super.handle(data)
    }
  }

  // 3. 定义一个支付服务类，继承数据校验、签名校验的trait
  class PayService extends DataValidateTrait with SignatureValidateTrait {
    override def handle(data: String): Unit = {
      println("准备支付...")
      super.handle(data)
    }
  }

  // 4. 创建支付服务对象，调用支付方法
  def main(args: Array[String]): Unit = {
    val service = new PayService

    service.handle("支付数据")
  }
}
