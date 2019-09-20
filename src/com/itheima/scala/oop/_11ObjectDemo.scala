package com.itheima.scala.oop

import java.text.SimpleDateFormat
import java.util.Date

object _11ObjectDemo {
  // 1. 创建一个DateUtil工具类
  object DateUtil {
    val simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")

    // 2. 定义一个用于日期格式化的方法
    def format(date:Date) = simpleDateFormat.format(date)
  }

  // 3. 测试格式化日期
  def main(args: Array[String]): Unit = {
    val now = new Date()

    println(DateUtil.format(now))
  }
}
