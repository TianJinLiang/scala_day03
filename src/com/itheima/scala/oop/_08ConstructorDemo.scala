package com.itheima.scala.oop

object _08ConstructorDemo {
  // 1. 定义Customer类
  // 2. 定义主构造器
  class Customer(var name:String="", var address:String="" ) {
    println("调用了主构造器~~~")
    // 3. 定义辅助构造器
    def this(data:Array[String])={
      this(data(0), data(1))
    }

    var age:Int = _;

    def this(name:String,address:String,age:Int)={

      this(name,address)
      println("调用了自定义的辅助构造器~~~")
      this.age = age
    }

    def this(age:Int)={

      this("ww","33")
      println("调用了自定义的辅助构造器~~~")
      this.age = age
    }


  }


  // 4. 使用辅助构造器来创建对象
  def main(args: Array[String]): Unit = {
//    val customer = new Customer(Array("张三", "北京"))
//    val 李四: Customer = new Customer("李四","深圳",22)
    val 李四1: Customer = new Customer(22)

//    println(customer.name)
//    println(customer.address)
    println(李四1.name)
    println(李四1.address)
    println(李四1.age)



  }
}
