package com.itheima.scala.oop

class Person7(val name:String,val age:Int){
  var score :Double=0.0
  var address:String="beijing"
  def this(name:String,score:Double)={
    //每个辅助constructor的第一行都必须调用其他辅助constructor或者主constructor代码
    //主constructor代码
      this(name,30)
      this.score=score
  }
  //其他辅助constructor
  def this(name:String,address:String)={
      this(name,100.0)
      this.address=address
  }
}
object o{

  def main(args: Array[String]): Unit = {
    val zs: Person7 = new Person7("zs","bj")
    println(zs.address)
  }
}


class Student7(name:String,score:Double) extends Person7(name,score)