package com.itheima.scala.oop

/*伴生对象
* */
object _11Demo {

  //伴生类
  class CustomerService{
    println("&"*10)

    def save()={
      println("CustomerService:保存客户")
      CustomerService.kehu()
      println("这是伴生类")
    }
  }
  //伴生对象
  object CustomerService{
    println("**********************")
    val a =100
    println(a)
  val service = new CustomerService
    service.save()

    def kehu()={
     println("这是伴生对象")
   }

//    println("-"*10)
  }

  def main(args: Array[String]): Unit = {
    //用伴生对象调伴生类
    val service1 = new CustomerService()
    service1.save()

//    CustomerService.kehu()

  }
} 