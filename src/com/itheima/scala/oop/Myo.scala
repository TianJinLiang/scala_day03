package com.itheima.scala.oop

object Myo {


  def pd[T](t:T): Unit ={

    val b: Boolean = t.isInstanceOf[Map[String,String]]

    if(b){

      println("这是一个map集合")
      //强转成map类型
      val map: Map[String, String] = t.asInstanceOf[Map[String,String]]

      //循环打印
      for ((x,y) <- map) println(x+"-->"+y)

    }else if(t.isInstanceOf[List[Int]]){
      println("这是一个list集合")
      //强转成list类型
      val list: List[Int] = t.asInstanceOf[List[Int]]
      //循环打印
      list.foreach(println)

    }

  }
  def main(args: Array[String]): Unit = {

    val map: Map[String, String] = Map("name"->"dbf4","sex"->"nan")
    val list: List[Int] = List(1,2,3,4)

    Myo.pd(list)
  }

}
