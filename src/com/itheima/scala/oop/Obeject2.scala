package com.itheima.scala.oop

object Obeject2 {


 abstract class  person{
    def say={
      println("你很帅~~")
    }
  }

  def main(args: Array[String]): Unit = {

    val person = new person {
      override def say: Unit = println("一般般~~~")
    }
    person.say
  }

}
