package my_prac

import scala.collection.mutable.ListBuffer

object Sample {
  def main(args: Array[String]): Unit = {

    val d1 = new Demo

    d1.num1 = 20
    d1.num2 = 10
    //d1.num3

    println(d1.add(5))

    val d2 = new Demo2

    d2.n1 = 10
    d2.n2 = 20

    val l1 = ListBuffer.empty[Int]
    l1 += 5
    l1 += 15

    val l2 = ListBuffer(10,20,30)

    println(d2.add(l1))
    println(d2.add(l2))


    println(l1)
    println(l2)

  }

  class Demo {
    var num1 = 0
    var num2 = 0
    private var num3 = 0
    def add(n: Int) = num1 + num2 + n
  }

  class Demo2 {
    var n1 = 0
    var n2 = 0
    private var n3 = 0
    var result = 0
    def add(lst: scala.collection.mutable.ListBuffer[Int]): Int = {
      lst -= 10
      lst.sum
    }
  }

}
